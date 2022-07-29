import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;
import java.util.InputMismatchException;

public class Dorm extends Operations implements Identifiers{
	private int dormNumber;
	private int numberOfStudents;
	// private int block_Number;
	private int blockIndex;
    public ArrayList<Student> studentsList = new ArrayList<>();
	
    public Dorm(int dormNumber, int numberOfStudents, int blockIndex ) {
        this.dormNumber = dormNumber;
        this.numberOfStudents = numberOfStudents;
		this.blockIndex = blockIndex;
    }

	public void addMember(Student student) {
		try {
			this.studentsList.add(student);
			this.numberOfStudents++;
			student.setDormNumber(this.dormNumber);
    	}catch(Exception e) {
			System.out.print("Error: ");
			System.out.println(e);
		}
	}

	public void removeMember(int id) {
		this.studentsList.remove(id);
	}
	public void addToStudentList(ArrayList<Student> newStudentList) { this.studentsList.addAll(newStudentList); }
	public void setDormNumber(int dormNumber){ this.dormNumber = dormNumber; }
	public void setNumberOfStudents(int numberOfStudents) {this.numberOfStudents = numberOfStudents;}
	public void setBlockIndex(int blockIndex){ this.blockIndex = blockIndex; }
	public int getBlockIndex(){ return this.blockIndex; }
	public int getDormNumber() {
		return this.dormNumber;
	}

	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
	public ArrayList getStudentsList(){ return this.studentsList; }

	public static void delete(){
		System.out.println("Choose the Dorm to remove all of it data : ");
		displayAll();
		Scanner S = new Scanner(System.in);
		int index;
		index = S.nextInt() - 1;
		Store.DormList.remove(index);
		System.out.println("The Data is Deleted Successfully!");
	}
	public static void displayAll() {
		StringBuilder sb = new StringBuilder();
		Formatter go7 = new Formatter(sb);
		System.out.println("List of Dorms");

		go7.format("%20s%20s%20s\n", "Block Name", "Dorm Number", "Number Of Students");
		for (int i = 0; i < Store.DormList.size(); i++) {
			//find the index of the Block where the dorm belongs
			int index = Store.DormList.get(i).getBlockIndex();
			go7.format("%20s%20s%20s\n", Store.BlockList.get(index-1).getName(), Store.DormList.get(i).getDormNumber(), Store.DormList.get(i).getNumberOfStudents());
			System.out.println(go7);
			sb.setLength(0);
			// refactor next for multiple dorms and/or students
			// Store.DormList.get(i).studentsList.addAll(Store.DormList.get(i).getStudentsList());
			System.out.println("List of Students");
			go7.format("%20s%20s%20s\n", "Name", "Id Number", "Gender", "Age");
			for (int j = 0; j < Store.DormList.get(i).studentsList.size(); j++) {
				go7.format("%20s%20s%20s\n", Store.DormList.get(i).studentsList.get(j).getStudentName(), Store.DormList.get(i).studentsList.get(j).getId(), Store.DormList.get(i).studentsList.get(j).getGender(), Store.DormList.get(i).studentsList.get(j).getAge());
				System.out.println(go7);
				sb.setLength(0);
			}
		}
	}

	public static void create() {
		Scanner sgc = new Scanner(System.in);
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int dormNumber, blockIndex, numberOfStudents;
		ArrayList<Student> studentsList = new ArrayList<>();
		if(Store.BlockList.size() == 0){
			System.out.println("Add blocks first!");
		}
		else{
			System.out.println("Choose Block: ");
			Block.displayAll();
			blockIndex = sgc.nextInt();
		
		System.out.println("Enter Dorm number: ");
		dormNumber = sgc.nextInt();
		System.out.println("Enter number of students in the Dorm: ");
		numberOfStudents = sgc.nextInt();

			String name;
			int id, age;
			char gender ;
			for(int i = 0; i < numberOfStudents; i++){
				System.out.println("Enter the data for the "+ (i+1) + "th student.");
				System.out.println(String.format("Enter Name:  %d", i+1));
				try{
					name = reader.readLine();
					//	System.out.println(String.format("Name %s", name));
					System.out.println(String.format("Enter Id: %d", i+1));
					id = sgc.nextInt();
					//	System.out.println(String.format("id %s", id));
					System.out.println(String.format("Enter Age : %d", i+1));
					age = sgc.nextInt();
					System.out.println(String.format("Enter Gender : %d", i+1));
					gender = sgc.next().charAt(0);
					Student newStudent = new Student(name,gender, id, age, dormNumber );
					studentsList.add(newStudent);
					Dorm newDorm = new Dorm( dormNumber, numberOfStudents, blockIndex);
					newDorm.addToStudentList(studentsList);
					Store.DormList.add(newDorm);
					System.out.println("The New Dorm Is Added Successfully!");
				}catch(IOException e){
					System.out.println("Error occured!");
				}
			}
		}
	}
	public static void update(){
		System.out.println("Choose the dorm you want to update the details of: ");
		displayAll();
		try{
		Scanner S = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index, num;
		String str;
		if (Store.DormList.size() == 0) {
			System.out.println("There is no available dorm!!!");
			return;
		} 
		else {
			index = S.nextInt() - 1;
			System.out.println("Which of the Dorm's details do you want to update?");
			Dorm.displayOne(Store.DormList.get(index));
			int ch = S.nextInt();
			switch (ch) {
				case 1:
					System.out.println("What should the new Dorm number be?");
					num = S.nextInt();
					Store.DormList.get(index).setDormNumber(num);
					break;
				case 2:
					System.out.println("What should the new block for this dorm be? (1, 2, 3 ...)");
					Block.displayAll();
					num = S.nextInt();
					Store.DormList.get(index).setBlockIndex(num);
					break;
				case 3:
					System.out.println("What should the new number of Students be?");
					num = S.nextInt();
					Store.DormList.get(index).setNumberOfStudents(num);
					break;
				default:
					System.out.println(" you entered wrong number.");
					break;
			}
		}
	}catch(InputMismatchException e){
		System.out.println("Invalid input");
	}catch(IndexOutOfBoundsException E){
		System.out.println("out of bound error");
	}
}

	private static void displayOne(Dorm dorm) {
		System.out.println("Dorm details here...");
		System.out.println(String.format("1) Dorm Number: %s", dorm.getDormNumber()));

		//access blockNumber of the Block where the Dorm belongs through dorm from Store
		int blockIndex = dorm.getBlockIndex();
		System.out.println(String.format("2) Block Number: %d", Store.BlockList.get(blockIndex).getNumber()));

		System.out.println(String.format("3) Number of Students: %d", dorm.getNumberOfStudents()));
		}
	

}

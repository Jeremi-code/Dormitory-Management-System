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
	private int block_Number;
	public ArrayList<Student> studentsList = new ArrayList<>();
    public Dorm(int dormNumber, int numberOfStudents ) {
		this.dormNumber = dormNumber;
		this.numberOfStudents = 0;
	//	this.block_Number = blockNumber;
		this.studentsList = studentsList;
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
	public void setBlock_Number(int blockNumber){ this.block_Number = blockNumber; }
	public int getBlock_Number(){ return this.block_Number; }
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
		Formatter go7 = new Formatter();
		System.out.println("List of Dorms");
		for (int i = 0; i < Store.DormList.size(); i++) {
			go7.format("%12s%12s%12s", "Block Name", "Dorm Number", "Number Of Students");
			go7.format("%12s%12s%12s", Store.BlockList.get(i).getName(), Store.DormList.get(i).getDormNumber(), Store.DormList.get(i).getNumberOfStudents());
			System.out.println(go7);
			Store.DormList.get(i).studentsList.addAll(Store.DormList.get(i).getStudentsList());
			System.out.println("List of Dorms");
			for (int j = 0; j < Store.DormList.get(i).studentsList.size(); j++) {
				go7.format("%12s%12s%12s", "Name", "Id Number", "Gender", "Age");
					go7.format("%12s%12s%12s", Store.DormList.get(j).studentsList.get(j).getStudentName(), Store.DormList.get(j).studentsList.get(j).getId(), Store.DormList.get(j).studentsList.get(j).getGender(), Store.DormList.get(j).studentsList.get(j).getAge());
				System.out.println(go7);
			}
		}
	}

	public static void create() {
		Scanner sgc = new Scanner(System.in);
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int dormNumber, blockNumber, numberOfStudents;
		ArrayList<Student> studentsList = new ArrayList<>();
		if(Store.DormList.size() == 0){
				System.out.println("Add blocks first!");
				return;
			}
		else{
			System.out.println("Choose Block: ");
			Block.displayAll();
			blockNumber = sgc.nextInt();
		}
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
				Dorm newDorm = new Dorm( dormNumber, numberOfStudents);
		newDorm.addToStudentList(studentsList);
		Store.DormList.add(newDorm);
		System.out.println("The New Dorm Is Added Successfully!");
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
			Dorm.displayDormDetails(Store.DormList.get(index));
			int ch = S.nextInt();
			switch (ch) {
				case 1:
					System.out.println("What should the new Dorm number be?");
					num = S.nextInt();
					Store.DormList.get(index).setDormNumber(num);
					break;
				case 2:
					System.out.println("What should the new number be?");
					num = S.nextInt();
					Store.DormList.get(index).setBlock_Number(num);
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
	  }
	  catch(InputMismatchException e){
		System.out.println("Invalid input");

		
	}
	catch(IndexOutOfBoundsException E){
		System.out.println("out of bound error");
	}
}


	private static void displayOne(Dorm dorm) {
		System.out.println("Dorm details here...");
		System.out.println(String.format("1) Dorm Number: %s", dorm.getDormNumber()));
		System.out.println(String.format("2) Block Number: %s", dorm.getBlock_Number()));
		System.out.println(String.format("3) Number of Students: %d", dorm.getNumberOfStudents()));
		}
	

}

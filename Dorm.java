import java.util.ArrayList;

public class Dorm {
	private int dormNumber;
	private int numberOfStudents;
	private int block_Number;
    private ArrayList<Student> studentsList = new ArrayList<>();
    
    public Dorm(int dormNumber, int numberOfStudents ) {
        this.dormNumber = dormNumber;
        this.numberOfStudents = numberOfStudents;
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
    public void removeMemeber(int id) {
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


}
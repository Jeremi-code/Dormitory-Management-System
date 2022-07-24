import java.util.ArrayList;

public class Dorm {
	private int dormNumber;
	private int numberOfStudents;
    private ArrayList<Student> studentsList = new ArrayList<>();
    
    public Dorm(int dormNumber, int numberOfStudents, ArrayList<Student> studentsList ) {
        this.dormNumber = dormNumber;
        this.numberOfStudents = numberOfStudents;
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
}
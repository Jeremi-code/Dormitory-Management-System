
public class Student {
    private String studentName;
	private char gender;
	private int age;
	private int id;
	private int dormNumber;
	// private int block_Number;
	public Student(String name, char gender, int id, int age, int dormNumber ){
		this.studentName = name;
		this.id = id;
		this.age = age;
		this.dormNumber = dormNumber;
	//	this.block_Number= blockNumber;
	}
	public void setDormNumber(int dormNumber) {
		this.dormNumber = dormNumber;
	}
	public void setStudentName(String name){ this.studentName = name; }
	public void setGender( char gender){ this.gender = gender; }
	public void setAge( int age ){ this.age = age; }
	public void setId( int id ){ this.id = id; }
	public int getDormNumber(){ return this.dormNumber; }
	public String getStudentName(){ return this.studentName; }
	public char getGender(){ return this.gender; }
	public int getAge(){ return this.age; }
	public int getId(){ return this.id; }


}

package lab02_02;

public class Student extends Person{

	 private String studentID;

	public Student(String name, int age, String gen, String studentID) {
		super(name, age, gen);
		this.studentID = studentID;
	}
	
	public Student(String name, int age, String studentID) {
		super(name, age); 
		this.studentID = studentID;
	}	

	@Override
	public String display() {
		return name + " ปีเกิด "+ age +" เพศ " + gen + " อายุ " + calculateBirthYear() + " ปี " +" studentID " + studentID;
	}
	 
	 
}

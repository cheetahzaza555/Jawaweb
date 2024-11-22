package lab01_1;

public class Person {
	public String name;
	public int age;
	public String gen;
	
	public int calculateBirthYear(){
		return 2567 - age  ;
	}
	
	public Person(String name , int age) {
		super();
		this.name = name;
		this.age = age;
		this.gen = "ไม่ระบุ";
	}

	public Person(String name, int age, String gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public String display() {
		return
		"ชื่อ:" + name + " อายุ: " + age +" เพศ: "+ gen + " ปีเกิด:" + calculateBirthYear();
		}
}

package lab02_02;

public class Person {
	protected String name;
	protected int age;
	protected String gen;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0 ) {
			System.out.println("กรุณากรอกปีเกิดให้ถูกต้อง");
			System.exit(0);
		}else {
			this.age = age;
		}
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
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
	
	public int calculateBirthYear(){
		return 2567 - age  ;
	}
	
	
	public String display() {
		return name + " เพศ " + gen + " อายุ " + calculateBirthYear() + " ปี" ;
	}
	
	
	
}

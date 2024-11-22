package lab01_1;

public class TestPerson {

	public static void main(String[] args) {
		Person som = new Person("สมศักดิ์",45,"ชาย");
		System.out.println(som.display());

		Person jom = new Person("จอมขวัญ", 30);
		System.out.println(jom.display());

	}

}

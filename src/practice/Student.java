package practice;

public class Student {
	
	String name = "asdas";
	int regNum = 123431;
	
	public void displayInfo()
	{
		System.out.println(name);
		System.out.println(regNum);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.displayInfo();	
	}
}

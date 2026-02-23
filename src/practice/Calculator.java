package practice;

public class Calculator {
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void subtraction(int a, int b) {
		System.out.println(a-b);
	}
	
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}
	
	public void division(int a, int b) {
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		calc.addition(30, 200);
		calc.subtraction(40, 10);
		calc.multiplication(40, 10);
		calc.division(24, 3);

	}

}

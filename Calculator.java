package k2;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public static void main(String[]args) {
		Calculator calc=new Calculator();
		System.out.println(calc.add(5, 10));
		System.out.println(calc.add(5,10,15));
		System.out.println(calc.add(5.5,3.2));
	}

}
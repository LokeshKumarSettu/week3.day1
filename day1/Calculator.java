package week3.day1;

public class Calculator {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
		
}
	public void mul(int num1,int num2) {
		System.out.println(num1*num2);
	}
	public void mul(double num1,double num2) {
		System.out.println(num1*num2);
	}
	public void sub(int num1,int num2) {
		System.out.println(num1-num2);
	}
	
	public void sub(double num1,double num2) {
		System.out.println(num1-num2);
	}
	public void div(int num1,int num2) {
		System.out.println(num1/num2);
	}
	public void div(double num1,double num2) {
		System.out.println(num1/num2);
	}
	
	
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(25, 30);
		calc.add(10,20,35);
		calc.mul(12, 13);
		calc.mul(12.5, 1.5);
		calc.sub(56, 45);
		calc.sub(35.56, 12.55);
		calc.div(34, 56);
		calc.div(35.6777, 12.888);
		
		
	}
		
	}
//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
//- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
//- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
//create object for the Calculator class and execute all the methods



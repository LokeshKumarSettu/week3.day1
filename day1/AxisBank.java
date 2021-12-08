package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		
		System.out.println("deposit of 9%");
		

	}
	
	public static void main(String[] args) {
		
		AxisBank info = new AxisBank();
		
		info.deposit();
		info.saving();
		info.fixed();
		
	}
}

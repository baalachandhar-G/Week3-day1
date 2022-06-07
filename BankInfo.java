package week3.day1;

public class BankInfo extends AxisBank {

	public void saving() {
		
		System.out.println("This is saving Account");
	}
	
	public void fixed() {
	
		System.out.println("This is Fixed Account");
	}
	
	public void deposit() {
		
		System.out.println(" you can deposit the amount");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankInfo BI= new BankInfo();
		
		BI.saving();
		BI.fixed();
		BI.deposit();
		
		// method override AxisBank
		BI.deposit(50000);
	}

}

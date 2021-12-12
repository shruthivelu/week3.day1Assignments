package week3.day1Assignments;

public class AxisBank extends BankInfo{

	public void deposit() {
		int deposit = 50000000;
		System.out.println(deposit);
	}
	
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}

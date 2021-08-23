package Override.Assignment;

public class AxisBank extends BankInfo {
	public void Deposit() {
		System.out.println("New Axis - Normal deposit of the Bank");
	}

	public static void main(String[] args) {
		AxisBank objBankDetails = new AxisBank();
		objBankDetails.Deposit();
		objBankDetails.fixed();
		objBankDetails.savings();
	}

}

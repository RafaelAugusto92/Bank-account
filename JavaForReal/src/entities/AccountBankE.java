package entities;

public class AccountBankE {
	
	private int accountNumber;
	private String accountName;
	private double depositAmount;
	
	public AccountBankE(int accountNumber, String accountName, double depositAmount) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.depositAmount = depositAmount;
	}
	
	public int getAccNumber(int value) {
		return accountNumber = value;
	}
	
	public String getAccName() {
		return accountName;
	}
	
	public void setAccName(String accName) {
		this.accountName = accName;
	}
	
	public double getDepositAmount() {
		return depositAmount;
	}
	
	public double getDeposit(double value) {
		return depositAmount += value;
	}
	
	public double getWithdraw(double value) {
		return depositAmount -= value;
	}
	
	

	
	
	public String toString() {
		return
				"Account number: " 
				+ getAccNumber(accountNumber)
				+ ", account name: "
				+ getAccName()
				+ ", deposit amount: "
				+ getDepositAmount();
				
	}

}

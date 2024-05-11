package Program;
import java.util.Locale;
import java.util.Scanner;
import entities.AccountBankE;

public class AccountBankP {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bank System");
		
		System.out.print("Enter with your acc number: ");
		int accNum = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter with your acc name: ");
		String accName = scanner.nextLine();
		
		System.out.print("Enter with your amount: ");
		double depositAmount = scanner.nextDouble();
		
		AccountBankE bank = new AccountBankE(accNum, accName, depositAmount);
		
		bank.getAccNumber(accNum);

		bank.setAccName(accName);
		
		System.out.println(bank);
		
		System.out.print("Deposit value: ");
		double deposit = scanner.nextDouble();
		bank.getDeposit(deposit);
		
		System.out.println(bank);
		
		System.out.print("Withdraw value: ");
		double withdraw = scanner.nextDouble();
		bank.getWithdraw(withdraw);
		
		System.out.println("Updated Data:");
		
		System.out.println(bank);
		
		
		scanner.close();
	}

}

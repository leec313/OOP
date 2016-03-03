package lab4;

public class DepositAccount extends Account
{
	public DepositAccount(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit,
			double acctBalance, float deposit, float withdraw, double interestRate) {
		super(accountName, accountNumber, sortCode, branchName, inCredit, acctBalance, deposit, withdraw);
		this.interestRate = interestRate;
	}

	double interestRate;
	
	float withdraw()
	{
		System.out.println("You cannot withdraw from a deposit account");
		return 0;
		
	}
}

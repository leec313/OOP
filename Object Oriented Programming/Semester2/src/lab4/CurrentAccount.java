package lab4;

public class CurrentAccount extends Account
{
	private static final boolean True = false;
	double penaltyAmount;
	
	public CurrentAccount(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit,
			double acctBalance,double penaltyAmount) {
		super(accountName, accountNumber, sortCode, branchName, inCredit, acctBalance);
	
		this.penaltyAmount = penaltyAmount;
	}

	
	float withdraw()
	{
		if (acctBalance <= 0)
		{
			System.out.println("Insufficient funds");
		}
		else
		{
			acctBalance = acctBalance - withdraw;
		}
		return (float) acctBalance;
	}
	
	String checkCredit()
	{
		if (inCredit = true)
		{
			 String output;
			 output = "Account in credit";
			return(output);
		}
		else
		{
			 String output2;
			 output2 = "Account in debt";
			return(output2);
	}
	

}

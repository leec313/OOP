package lab4;

public class Account 
{
	String accountName;
	int accountNumber;
	String sortCode;
	String branchName;
	boolean inCredit;
	double acctBalance;
	float deposit;
	float withdraw;
	
	public Account(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit, double acctBalance)
	{
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		this.acctBalance = acctBalance;

		
	}
	


	float deposit()
	{
		return (float)(deposit + acctBalance);
	}
	
	float withdraw()
	{
		if (acctBalance < 0);
		{
			inCredit = false;
		}
		return (float)(withdraw - acctBalance);
	}
	
	public String toString()
	{
		String content = ""+ accountName +" "+ accountNumber +" "+ sortCode +" "+ branchName +" "+ inCredit +" "+ acctBalance ;
				
		return content;
	}
	
	
}

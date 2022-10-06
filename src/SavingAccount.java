
public class SavingAccount 
{
	private int accNo;
	private float balence;
	private String accHolderName;
   public static double interestRate =5.4;
	public SavingAccount()
	{ 
		balence=542.00f;
	}	public SavingAccount(int accNo,String accHolderName)
	{
	    this ();
		this.accNo=accNo;
		this.accHolderName=accHolderName;
	}
	 public void ShowAccStatus()
	 {
		System.out.println("Account number is:"+accNo) ;
		System.out.println("Account holder name is:"+accHolderName) ;
		
		
	 }
		
}

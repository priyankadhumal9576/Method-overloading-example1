
public class RecurringAccount
{
	private int accNo;
	private float balence;
	private String accHolderName;

	public RecurringAccount()
	{ 
		balence=5000.00f;
	}
	public RecurringAccount(int accNo,String accHolderName)
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

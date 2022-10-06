
public class FD_Account
{
private int accNo;
private float balence;
private String accHolderName;

public FD_Account()
{ 
	balence=5000.00f;
}
public FD_Account(int accNo,String accHolderName)
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

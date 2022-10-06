
public class Bank {
    

		public void accessAccount(SavingAccount s)
		{
			System.out.println("Saving account details are:");
		 	s.ShowAccStatus();
		}
		public void accessAccount(RecurringAccount r)
		{
			System.out.println("Recurring Account details are:");
		   r.ShowAccStatus();
		}
		public void accessAccount(FD_Account f)
		{
			System.out.println("FD_Account details are:");
			f.ShowAccStatus();
		}
	
	
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		FD_Account f=new FD_Account(512,"Shruti");
		SavingAccount s=new SavingAccount(549,"riya");
		RecurringAccount r=new RecurringAccount(421,"aarya");

		b.accessAccount(f);
		b.accessAccount(r);
		b.accessAccount(s);
		
	}
}


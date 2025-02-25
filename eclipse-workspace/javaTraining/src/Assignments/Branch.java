package Assignments;

public class Branch extends Branch_plan {
	

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
                 Branch b=new Branch();
                 b.check_accounts(1000);
                 b.pay_tax(2000);
                 b.do_interview();
	}

	@Override
	public void receive_Customers() {
		// TODO Auto-generated method stub
		
	}

}
//public void check_accounts(1000)
//- //public int pay_tax(2000)
 // - Check if value is returned. 
//- public void do_interview()
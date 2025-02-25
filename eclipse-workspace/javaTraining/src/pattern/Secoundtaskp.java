package pattern;

public class Secoundtaskp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Secoundtaskp  s=new Secoundtaskp();

		
		s.accending();
		System.out.println();
		s.onezero();
		System.out.println();
		s.zeroone();
		System.out.println();
	     s.ch();	
	}

	private void ch() {
		// TODO Auto-generated method stub
		
		
		
		
		
		for(int i=5;i>=1;i--) {
		

                  char count='A';
			for(int j=1;j<=i;j++) {
				System.out.print(count++ +" ");
			}
			
			System.out.println();
		}
		
	}
		
	

	private void zeroone() {
		
for(int i=5;i>=1;i--) {
	        
	          if(i%2==0) {
	
			for(int j=1;j<=i;j++) {
				
				if(j%2==0) {
				
				System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
				
				}
			
			
		        }
	         
 
                     else {
                 
                    	 for(int j=1;j<=i;j++) {
	
	                     if(j%2==0) {
	
                     	System.out.print("1 ");
	                         }
                             	else
                                       	{
		                             System.out.print("0 ");
                                        	}
	
	                     }


}

	}
System.out.println();
		
	}

	private void onezero() {
		
		

		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				if(j%2==0) {
				
				System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
				
				}
			
			System.out.println();
		}
		
		
		
		
	}

	private void accending() {
		
		int count=1;
		
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(count++ +" ");
			}
			
			System.out.println();
		}
		
	}

}

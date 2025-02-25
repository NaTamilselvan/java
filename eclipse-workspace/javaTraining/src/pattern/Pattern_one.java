package pattern;

public class Pattern_one {

	public static void main(String[] args) {
		 Pattern_one  p=new Pattern_one();
		 p.one_order();
		 
		 System.out.println();
		 
         p.five_order();
         
         System.out.println();
         
         p.accending_order();
         
         System.out.println();
         
         p.decending_order();
         
	    System.out.println();
	    
	    p.five_reverse();
	    
	    System.out.println();
	    
	    p.five_forward();
		 
		 
		 
		 
	}
	private void five_forward() {
		// TODO Auto-generated method stub
		
		
		   int k=1;
			 for(int i=5;i>=1;i--) {
				 
				 for(int j=1;j<=i;j++) {
					 System.out.print((j*k)+" ");	 
				 }
				 k++;
				 System.out.println();
				 
			 }	
		
		 
		
	}
	private void five_reverse() {
		   int k=5;
		 for(int i=5;i>=1;i--) {
			 
			 for(int j=1;j<=i;j++) {
				 System.out.print((j*k)+" ");	 
			 }
			 k--;
			 System.out.println();
			 
		 }	

		
		
	}
	private void decending_order() {
		
for(int i=5;i>=1;i--) {
			
			for(int j=i;j>=1;j--) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		 
		 
		
		
	}
	private void accending_order() {
		// TODO Auto-generated method stub
		
		
		
		 
		 for(int i=1;i<=5;i++) {
			 for(int j=i;j<=5;j++) {
				 System.out.print(j+" ");	 
			 }
			 System.out.println();
			 
		 }
		
		
		
		
	}
	private void five_order() {
		// TODO Auto-generated method stub
		
		
		
		 
		 for(int i=1;i<=5;i++) {
			 for(int j=5;j>=i;j--) {
				 System.out.print(j+" ");	 
			 }
			 System.out.println();
			 
		 }
		
		
	}
	void one_order() {
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
	
	
	
	

}

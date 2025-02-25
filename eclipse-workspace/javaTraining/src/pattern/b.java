package pattern;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1; row<=7; row++)
	      {
	        for(int col=1; col<=7; col++)
	        {
	          if(row==1 || row==7)
	          { 
	          if(col!=7)
	            System.out.print("* ");
	          }
	          else if(col==1 ||  col==7)
	            System.out.print("* ");
	          else
	            System.out.print("  ");
	        }
	        System.out.println(); 
	      }
		  
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				  if (i==7) {
					      if(j!=7) {
					  System.out.print("* ");}
				              }
				     else if(j==1 || j==7 ) {
				    	    
				           System.out.print("* ");
			               }
			          else {
				           System.out.print("  ");
			            }
			   }
			System.out.println();
		}
		    
		
		

	}
}



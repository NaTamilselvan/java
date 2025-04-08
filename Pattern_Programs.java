package pattern;

public class Pattern_Programs {

	public static int binarySearch(int[] arr,int key) {
		
		int min=0 , max = arr.length-1;
		
		while(min<=max) {
		     //System.out.println("yes i am enter 1");	
			int mid= min+max/2;
			
			//System.out.println(mid);
			
			if(key==arr[mid]){
				
				//System.out.println("yes i am enter 2");
				
				return mid;
			}
			else if (key<arr[mid]) {
				
				//System.out.println("yes i am enter 3");
				
				max=mid-1;
			}
			else {
				
				//System.out.println("yes i am enter 4");
				min=mid+1;
			}
			
			
		}
		
		return -1;
		
	}
	
	
	
	public static void P1() {
		
		/*   1  2  3   4  5
		 *   
		 *   2  3  4   5  6
		 *   
		 *   3  4  5  6   7  
		 *   
		 *   4  5  6  7   8
		 *   
		 *   5  6  7   8   9
		 *   
		 */
		
		
		for( int i=0;i<=5;i++ ) {
			
			for( int j=1;j<=5;j++ ) {
				
				System.out.print( i+j+0+" ");
				
			}
			
			System.out.println();
		}
		
				
	}
	
	public static void main(String[] args) {
         p9();
		 p8();
		//p7();
		
		//int[] a= {10,25,45,67,89,97,101,121};
		
		//int b=binarySearch(a, 89);

		//System.out.println(b);
		
		

	}

	private static void p9() {

		  int n=5;
		  
		  for(int i=1;i<=n;i++) {
			  
			  for(int j=1;j<=i;j++) {
				  
				  if(j==1 || j==i || i==n) {
					
					  System.out.print(i+" ");
				  }
				  else {
					  System.out.print("  ");
				  }
			  }
			  
			  System.out.println();
		  }
		
		
		
	}



	private static void p8() {

		int n=5;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
			
				if (k==0 || i==k || i==n-1) {
				System.out.print("* ");}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		
		
	}



	private static void P5() {
		
		int n=5;
		
		for( int i=0;i<n;i++) {
			
			for(int j=0;j<=n-1-i;j++) {
				System.out.print("  ");
			}
			
			for( int k=0;k<=i;k++)
			{
				//j == 0 || j == i || i == n - 1
				if(k == 0 || k == i || i == n-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			
			System.out.println();
		}
		
	}

	private static void P4() {
		
		 int n = 5;

	        for (int i = 0; i < n; i++) {

	            // Print leading spaces
	            for (int j = 0; j < n - 1 - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars and hollow spaces
	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || j == i || i == n - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // two spaces for alignment
	                }
	            }

	            System.out.println();
	        }
	    }
	
public static void p7() {
		
		int n=5;
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=n-1-i;j++) { //5-0-1=4    
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				
				if ( k == 0 || k == i )
				{
				    System.out.print(k+" ");}
				else if(i == n-1) {
				     System.out.print(k+" ");
				}
				
				else {
					System.out.print("  ");
				}
			         }
			
			
			System.out.println();
			
		}
		
	}
	
	public static void p6() {
		
		int n=5;
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=n-1-i;j++) { //5-0-1=4    
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				
				if ( k == 0 || k == i || i == n-1)
				{
				    System.out.print("* ");}
				else {
					System.out.print("  ");
				}
			         }
			
			
			System.out.println();
			
		}
		
	}
	

	private static void P3() {
		
			
			/*   1  2  3   4  5
			 *   
			 *   2  3  4   5  6
			 *   
			 *   3  4  5  6   7  
			 *   
			 *   4  5  6  7   8
			 *   
			 *   5  6  7   8   9
			 *   
			 */
			
			
			for( int i=1;i<=5;i++ ) {
				
				for( int j=1;j<=5;j++ ) {
					
					if(i+j<10) {
						System.out.print("0");
					}
					
					System.out.print(i*j+" ");
					
				}
				
				System.out.println();
			}
			
		
		
		
	}

	private static void P2() {
		
		
			
			/*   01  02  03   04  05
			 *   
			 *   02  03  04   05  06
			 *   
			 *   03  04  05   06   07  
			 *   
			 *   04  05  06   07   08
			 *   
			 *   05  06  07   08   09
			 *   
			 */
			
			
			for( int i=0;i<=5;i++ ) {
				
				for( int j=1;j<=5;j++ ) {
					
					if(i+j<10) {
						System.out.print("0");
					}
					
					System.out.print( i+j+0+" ");
					
				}
				
				System.out.println();
			}
			
		
		
		
	}

}

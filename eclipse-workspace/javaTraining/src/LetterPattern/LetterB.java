package LetterPattern;

public class LetterB {
	
	
	public static void pattern() {

		
		for (int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				if( (i==0 && j<4)||(i==4 && j<4) || j==0 || j==4)
				
				System.out.print("* ");
				else
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
           for (int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				if( i==4 || j==0 || j==4)
				
				System.out.print("* ");
				
				else
				 System.out.print(" ");
			}
			
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
		for(int row = 1; row <=8 ;row++) {
			
			for(int col=1;col<=5;col++) {
				
				if ( (row == 1 || row == 5) && col!=1 || row == 8 || col==1 || (col==5 && row!=1) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}

package LetterPattern;

public class Cletter {
	
	public static void firstC() {
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if (i==0 || i==4 || j==0 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


		
	}

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				if ( i == 0 || i == 4 || j==0 ) {  
					
					if (i==0 && j==0 || j==0 && i==4) {
						
						System.out.print(" ");
					}
					else{
					System.out.print("* ");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

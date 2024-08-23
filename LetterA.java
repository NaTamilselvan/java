package tapacademy;

public class LetterA {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<=10;j++) {
				
				if(  (j-i==5 || i+j==5  )) {
					
					System.out.print(" *");
				if(i==3 && (j>3 && j<5)){
						System.out.print("*");
						
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

package dailysome;

public class Pracket {

	public static void main(String[] args) {
		
		// output {}
	
		int inner=1;
		

		
	    for(int k=1;k<=5;k++) {	
		
		for(int i=1;i<=inner;i++) {
			
			System.out.print("{");
			
		}
	     
		for(int j=1;j<=inner;j++) {
			System.out.print("}");
			
		}
	     
		System.out.println();
		inner++;
	}
	
	}

}

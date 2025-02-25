package pattern;

public class ReverseTree {

	
public  static void pattern3() {
		
		
		for( int i=1;i<=5;i++) {
			
			for( int j=5;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}


	
	
	public  static void pattern2() {
		
		
		for( int i=1;i<=5;i++) {
			
			for( int j=1;j<=i;j++ ) {
				
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public  static void pattern() {
		
		
		for( int i=5;i>=1;i--) {
			
			for( int j=1;j<=i;j++ ) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		 
		System.out.println("hi");
		pattern();
		System.out.println();
		pattern2();
		System.out.println();
		
		pattern3();

	}

}

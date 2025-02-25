package StarPattern;

import java.util.regex.Pattern;

public class NumberPattern {
	
	void p1() {
		
        int k=1,l=0;
		
		for( int i=1;i<=5;i++ ) {
			
			for( int j=1;j<=5;j++ ){
				
				if (i%2==0) {
					k=k+5;
					System.out.print(k+" ");
					k--;
				}
			    
				else {
				System.out.print(k++ +" ");
				l=k; }
			}
			
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		
		int rows= 5 , cols= 5, start= 1;
	
		
		for(int i=1;i<cols;i++){
			
			int num=start;
			
			if( i%2==1 ) {
				
	           System.out.print(num);			
				
			}
			else {
				
			}
			
		     	
			System.out.println();
		}
				
	}
	
	
	 //Pattern sp=new Pattern("ab", 0);
	 
	 

}

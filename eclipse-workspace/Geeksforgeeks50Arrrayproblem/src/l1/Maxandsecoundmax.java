package l1;

public class Maxandsecoundmax {

	public static void maxsecound(int[] arr) {
		
		int max,smax;
		
		max=smax=-1;
		
		for( int i = 0;i < arr.length; i++ ) {
			
			if (arr[i] > max) {
				
				smax=max;
				
				max=arr[i];
			}
			else {
				
				if( arr[i] > smax ) {
					
					smax=arr[i];
					
				}
			}
		}
		
		
		System.out.println("The maximum number is "+ max);
		
		System.out.println("The maximum number is "+ smax);
	}
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {7,4,3,2,1,6,8};
		
		maxsecound(arr);
		
		

	}
	
	

}

package l1;

public class SecoundLargeElement {
	
	
public int Max(int[] arr){
		
		//first i find max value;
		
		int max=0 , secoundMax=0;
		
		
		for( int i = 0; i < arr.length; i++ ) {
			
			if ( arr[i] > max) {
				
				secoundMax = max ;
				
				max = arr[i] ;
				
			}
			
		}
		
		return max;
	}
	
	
	
	
	
	
	public int secoundMax(int[] arr) {
		
		//first i find max value;
		
		int max=0 , secoundMax=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if ( arr[i] > max) {
				
				secoundMax=max;
				
				
				max=arr[i];
				
			}
		}
		
		
		
	        return secoundMax;
	}
	
	public static void main(String[] args) {
		
		
		//declare  Array

		//int[] a=new int[5];
		
		//Array declare and initialization in single line
		
		int[] a= {55,10,63,34,54,23,56,34,56,76};
		
		SecoundLargeElement s=new SecoundLargeElement();
		
		int max=s.Max(a);
		
		int smax=s.secoundMax(a);
		
		System.out.println("The maximum number is "+max);
		
		System.out.println("The secoundmaximum number is "+smax);
		
		
		
	}

}

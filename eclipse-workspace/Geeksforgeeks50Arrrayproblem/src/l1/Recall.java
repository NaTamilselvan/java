package l1;

public class Recall {
	
	
	
	public  static void minandSecoundMax(int[] arr) {
		
		
		int max =-1, secoundmax = -1;
		
		
		for(int i=0;i< arr.length ;i++) {
			
			if ( arr[i] > max) {
				
				secoundmax=max;
				
				max=arr[i];
				
			}
			else {
				
				if(arr[i]> secoundmax) {
					
					 secoundmax =arr[i];
					
				}
			}
			
		}
		
		
		System.out.println("The maximum number is "+max);
		
		System.out.println("The secoundmaximum number is "+secoundmax);
		
		
		
	}

	public static void main(String[] args) {
		
		int[] arr= {400,10,230,344,3,2,-9,212,565};
		
		minandSecoundMax(arr);
		
		

	}

}

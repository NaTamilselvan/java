package l1;

import java.util.Arrays;

public class Triplet {

	public static void main(String[] args) {
		
		
		int[] arr= {-10, -3, 5, 6, 20};
		
		int n=arr.length;
		
		Arrays.sort(arr);
		
		
		System.out.println(arr[n-1]* arr[n-2]*arr[n-3]);
 		
		
		

	}

}

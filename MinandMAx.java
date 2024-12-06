package l1;

import java.util.*;

public class MinandMAx {
	
	int mi,ma;
	
	static MinandMAx getMinMax(int[] arr) {
		
		Arrays.sort(arr);
		
		MinandMAx mm=new MinandMAx();
		
		mm.ma=arr[arr.length-1];
		
		mm.mi=arr[0];
		
		return mm;
		
	}
	
	 static int[]  maxMin(int[] arr) {
		
		 int min=Integer.MAX_VALUE ;
		 
		 int max=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if (arr[i]<min) {
				 min=arr[i];
			 }
			 if (arr[i]>max) {
				 
				 max=arr[i];
			 }
		 }
		 
		   int[] arr2= {min,max};
		   
		   return arr2;
		 
	}

	public static void main(String[] args) {
		
		   Scanner scan=new Scanner(System.in);
		   
		   System.out.println("Enter the Array size values");
		   
		   int n=scan.nextInt();
		   
		   int arr[]=new int[n];
		   
		   for(int i=0;i<arr.length;i++) {
			   
			   arr[i]=scan.nextInt();
		   }
		   
		   
		  
				int arr2[]=maxMin(arr);
			
		    
		    System.out.println("The min value "+ arr2[0]);
		   
		    System.out.println("The max value "+ arr2[1]);
			   
			   
		    MinandMAx m=getMinMax(arr);
		    
		    
		    System.out.println("The min value "+ m.mi);
			   
		    System.out.println("The max value "+ m.ma);
			   
		   

	}

}

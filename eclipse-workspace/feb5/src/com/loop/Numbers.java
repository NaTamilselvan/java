package com.loop;

//import java.util.*;

import java.util.*;

public class Numbers {

	public static void main(String[] args) {
		
		
		  Scanner scan=new Scanner(System.in);

		 int[] arr=new int[5];
		  
		 int i=0;
		  while(i<arr.length) {
			  
			  arr[i]=scan.nextInt();i++;
			  
		  }
		  
		  
		  int sum=0;
		    
		    int min=Integer.MAX_VALUE;
		    
		    int max=Integer.MIN_VALUE;;

		         for(int n:arr){
		             
		             sum+=n;
		             
		             if(min>n) min=n;
		             if(max<n) max=n;
		             
		             
		             
		         }
		         
		         
		         
		         System.out.println(min);

		         System.out.println(max);
		         
		         
		         System.out.println((sum-max)+" "+(sum-min));
		         
		         
		         
                  ArrayList  arr1=new ArrayList();
                  
                  System.out.println(arr);
	}

}

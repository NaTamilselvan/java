package arrayassignment2122024;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner  sc=new Scanner(System.in);
		
		//int[] a=new int [5];
		
		//for(int i=0;i)
		
//		for(int i=0;i<a.length;i++) {

	//		a[i]=sc.nextInt();
			
			
		//}
   
   
   int[] ar = {10,20,30,40,10,20,50}; 
   int key = 10; 
   int count = 0; 
   for(int i=0; i<ar.length;i++)
   {
     if(key == ar[i])
    	   System.out.println(i);
    	 count++; 
    	 if(count>2) {
    		 break;
    	 }
   }

		
		
		

	}

}

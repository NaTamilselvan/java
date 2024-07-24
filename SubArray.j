package GeeksForGeeksArray50problems;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

	public static ArrayList sub(int a[], int sum,int n) {
		
	int i=0,j=0,k;
	
	k=a[0];
	
	ArrayList<Integer> al=new ArrayList<Integer>(); 
	
	while(j<n) {
		
		 if(sum==k){
			
			al.add(i+1);
			al.add(j+1);
	        return al;
	        
		}
		
		else if(sum>k) {
			
			j++;
			sum+=a[j];
			continue;
			
		}
		else if(sum<k) {
			sum-=a[i];
			i++;
			continue;
		}
		
		
	}
	
	al.add(-1);
	
	return al;
	
	
	
	
	
	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		
		  int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23;
		
		  int len=arr.length;
		  
		  List<Integer> l=sub(arr,sum,len);
		  
		  for(int s:l) {
			  
			  System.out.println(s);
		  }

	}

}

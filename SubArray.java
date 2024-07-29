package level1;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

	public static List subArray(int[] a,int sum ,int n) {
		
		
		ArrayList al=new ArrayList<Integer>();
		
		int array_sum=a[0];
		
		int i = 0, j = 0;

		while(j<n) {
			if(sum==array_sum) {
				
				al.add(i+1);
				
				al.add(j+1);
				
				return al;
			}
			if(array_sum<sum) {
				
				j++;
				array_sum+=a[j];
				continue;
				
			}
			if(array_sum>sum) {
				
				array_sum-=a[i];
				i++;
				continue;
				
			}
			
		}
		
		al.add(-1);
		return al;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		//int[] a= {12,22,33,4,56,78};
		
		// int[] a={15, 2, 4, 8, 9, 5, 10, 23};
		
	int[] a= {1, 4}; 
		
		List <Integer> l=subArray(a,0,a.length);
		
		for(int aa:l)
		
		System.out.println(aa);


	}

}


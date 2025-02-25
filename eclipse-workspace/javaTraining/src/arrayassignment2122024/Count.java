package arrayassignment2122024;

public class Count {

	
	public static void main(String[] args) {
		
		int[] ar = {10,20,30,40,10,20,50,10,20,30,30,47,67,10}; 
		
		
		for(int i=0;i<ar.length;i++) {
			
			int key=ar[i],count=0;
			
			  for(int j=0;j<ar.length;j++) {
				  if(ar[j]==key) {
					  
					  if(j<i) {
						  break;
					  }
					  
					  count++;
				  }
			  }
			  if(count>0)
			  System.out.println(ar[i]+"times  "+count);
			
		}
		
	}
	
}

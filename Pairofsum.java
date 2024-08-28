public class Pairofsum {

	public static void main(String[] args) {

		
       
		int arr[] = {1, 1, 1, 1},target = 2,count=0 ;
		
		
		for (int i=0;i<arr.length-1;i++) {
			
			int key=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				 
				if(arr[i]+arr[j]==target ) {
					count++;
					
				}
				
				
			}
		}
		
		System.out.println(count);
	}

}

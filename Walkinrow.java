

public class Walkinrow {

	public static void findWidth(int a[],int height) {
		
		int width=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<=5) {
				width++;
			}
			else {
				width+=2;
			}

			
			
		}
		
		System.out.println(width);
		
		
	}
	
	public static void main(String[] args) {
      
		int[] a= { 4,5,14,7,5};
		
		findWidth(a, a.length);
		
		 

	}

}


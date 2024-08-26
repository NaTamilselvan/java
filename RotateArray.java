package level2;

public class RotateArray {

	public static void main(String[] args) {
		
		
		
		int[] a= {1,2,3,4,5,6,8};
		
		int n=a.length;
		int last=a[a.length-1];
		int last_el = a[a.length - 1];
		
		//System.out.println(last);
		//System.out.println(last_el);
		//System.out.println(a[last]);
		
		
		for(int i=a.length-1;i>0;i--) {
			  
			 a[i]=a[i-1];
			
			
		}
		
		a[0]=last;
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}

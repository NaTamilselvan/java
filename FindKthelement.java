package Daily5arrayproblem;

import java.util.Arrays;

public class FindKthelement {

public static int	findkth(int[] a,int[] b) {
	
	 int[] c=new int[a.length+b.length];
	 
	 int alen=a.length;
	 
	 for(int i=0;i<a.length;i++) {
		 
		 c[i]=a[i];
	 }
	 
	 for(int i=0;i<b.length;i++) {
		 
		 c[i+alen]=b[i];
		 
	 }
	
	 Arrays.sort(c);
	 for(int i=0;i<c.length;i++) {
		 System.out.println(c[i]);
	 }
	
	
	
	return 1;
}
	
	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,7,9};
		
		int b[]= {2,6,8,10};

		
		findkth(a,b);
		
	}

}


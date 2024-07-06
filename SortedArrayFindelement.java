public class SortedArrayFindelement {
	
	
	
	public static int main1(int[] a,int[] b,int k) {
		
		
		int i=0,j=0,d=0;
		
		int[] c=new int[a.length+b.length];
		
		while(i<a.length && j<b.length) {
			
			if(a[i] < b[j] ) {
				
				c[d++]=a[i++];
				
				//birds[a[i]++];
				
			}
			else {
				
				c[d++]=b[j++];
			}
			
			
		}
		while(i<a.length){
			
			c[d++]=a[i++];
			
			
		}
		
		while(j<b.length){
			
			c[d++]=b[j++];
			
			
		}
		
		
		return c[k-1];
	}

	public static void main(String[] args) {

		
		int[] a= {1,5,6,8,9};
		
		int[] b= {7,10};
		
		int k=4;
		
		
		System.out.println(main1(a,b,k));

	}

}


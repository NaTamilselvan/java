package l1;

public class Mid {
	
	
	static int searchbinary(int[] a,int key,int n) {
		
		
		 int l=0,r=n-1;
		
            while(l<=r) {
			
            	 int mid=(l+r)/2;
			
			
			if (a[mid]==key) {
				
				return mid;
			}
			
			else if ( a[mid]>key ) {
				// key=70 mid =50  50>70
				r=mid-1;
				
			}
			
			else {
				
				l=mid+1;
			}
		}
            return -1;
            
	}

	public static void main(String[] args) {

		int[] a= {10,20,30,40,50,60,70,80,90};
		
		
		
		int Ans=searchbinary(a,20,a.length);
		
		System.out.println(Ans);
		
	}

}

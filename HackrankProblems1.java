public class HackrankProblems1 {
					

	
	public static int majarity(int[] a) {

		
		Arrays.sort(a);
		
		int mid =a.length/2;
		
		return a[mid];
		
		
		
	}
	
	

	public static int majarity2(int[] a) {
		
		int count=1,majarity=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(count==0) {
				count++;
				majarity=a[i];
			}
			else if(a[i]!=majarity) {
				count--;

			}
			else {
				count++;
			}
		}
		return majarity;
		
	}
	
	public static void main(String[] args) {
		
		int[] aa= {1,1,2,3,4,4,4,4,3,5};
		
		System.out.println(migration(aa));
		 
		System.out.println(StringPassword("Tamil10&"));
		
		
		int a[]= {2,2,2,2,1,3,4,4};
		
		System.out.println(majarity(a));
		
		System.out.println(majarity2(a));
		
		 
	}

}

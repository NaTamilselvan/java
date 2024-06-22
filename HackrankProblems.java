package Hackrank;

public class HackrankProblems {

	public static int migration(int[] a) {
		
		 int[] birds=new int[a.length];
		 
		 for(int i=0;i<a.length;i++) {
			 
			 birds[a[i]]++;
		 }
		 
		 int maxindex=0,max=-1;
		 
		for(int i=0;i<birds.length;i++) {
			System.out.println(birds[i]);
			
			if(birds[i]>max) {
				
				max=birds[i];
				
				maxindex=i;
				
			}
			
			
		}
		 
		return maxindex;
	}
	
	
	public static void main(String[] args) {
		
		int[] a= {1,1,2,3,4,4,4,4,3,5};
		
		System.out.println(migration(a));
		
		
		 
	}

}


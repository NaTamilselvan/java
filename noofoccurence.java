public class noofoccurence {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60,70,10,203,040,40,50};
		
		int[] b=new int[a.length];
		
		int temp=0;
		
		
		for(int i=0;i<a.length;i++) {
			
			temp=a[i];
			int count=1;
			
			 for(int j=i+1;j<a.length;j++) {
				 
				 
				 if(a[i]==a[j]) {
				
					 count++;
					 
					 b[j]=-1;
				 }
				 
			 }
			 
			 if(b[i]!=-1) {
				 b[i]=count++;
			 }
			
		}
		
		
		
		for(int i=0;i<a.length;i++) {
			if(b[i]>0)
			System.out.println(a[i]+"is occureence"+b[i]);
		}
		

	}

}

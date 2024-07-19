package level1;

public class Acesndingorder {

	public static void Accending(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
			 
				int temp=0;
				
			   if(a[i]>a[j]) {
				   
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
				
		}
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a= {12,1,45,33,22,21};
	
		Accending(a);
	}
	
	

}


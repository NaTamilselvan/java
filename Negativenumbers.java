package level1;

public class Negativenumbers {

	public static void NagativeNumber(int a[]) {
		
		
		int j=0,temp=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<0) {
				if(i!=j) {
				
				temp=a[i];
				
				a[i]=a[j];
				
				a[j]=temp;
				
			}
				j++;
			}
			
			
			
			
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
       int[] array= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
       
       NagativeNumber(array);
		
	}

}


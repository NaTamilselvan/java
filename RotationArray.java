package GeeksForGeeksArray50problems;

public class RotationArray {

	static int[] rotaionOfArray(int[] a,int k,int[] q) {
		
		int n=a.length;
		
		int result[]=new int[q.length];
		
		int[] b=new int[a.length];
		
		
		for(int i=0;i<a.length;i++) {
			
			b[(i+k)%n]=a[i];
		}
		
		for(int i=0;i<q.length;i++) {
			
			result[i]=b[q[i]];
		}
		
		return result;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int d = 1;
		int[] queries= {1,2,3,4,5,6,7,8};
		
		
		int[] a=rotaionOfArray(arr,d,queries);
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
     
	}

}

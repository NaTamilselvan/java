package feb21array;

public class MInmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,12,45,15,47,32,-3};
		
		int min=a[0],max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
			}
			
		}
		System.out.println(min);
		
		System.out.println(max);
		
		
		
	}

}

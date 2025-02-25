package arrayassignment2122024;

public class Secoundmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  a= {-23,-56,10,-6,34,-67,8,2};
		
		int first=Integer.MIN_VALUE,secound=0;
		
		for(int i=1;i<a.length;i++) {
			
			if(first<a[i]) {
				secound=first;
				first=a[i];
			}
			else if(secound>a[i]) {
				secound=a[i];
			}
		}

		
		System.out.println(first);
		
		System.out.println(secound);
		
	}

}

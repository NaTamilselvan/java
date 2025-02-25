package feb21array;

public class Secoundmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,80,34,79,65};
		
		int max=a[0];
		int secound_max=0;
		
		for(int i=1;i<a.length;i++) {
			
			if(max<a[i]) {
				
				if(secound_max<max);
				  secound_max=max;
				max=a[i];
				
			}
		}

		System.out.println("The maximum values is "+max);
	
		System.out.println("The  secound maximum values is "+secound_max);

}
}

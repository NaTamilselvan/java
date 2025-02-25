package arrayassignment2122024;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,30,40,10,20,50}; 
		
		for(int i=0;i<ar.length;i++) {
			
			int key=ar[i];
			int count=0;
			
			for(int j=0;j<ar.length;j++) {
				if(key==ar[j]) {
					count++;
				}
			}
			System.out.println(ar[i]+"is times "+count);
		}

	}

}

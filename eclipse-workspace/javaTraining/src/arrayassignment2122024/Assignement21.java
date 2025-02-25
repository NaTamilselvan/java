package arrayassignment2122024;

public class Assignement21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark[]= {23,45,67,43,22};
		int count=0;
		
		for(int i=mark.length-1;i>=0;i--) {
			if(mark[i]%2==0)
			System.out.println("The even value  "+mark[i]);
			else {
				System.out.println("The odd values "+mark[i]);
			}
			if(mark[i]>80) {
				System.out.println(mark[i]);
				count++;
			}
			
		}
		System.out.println("More then 80 values is "+count);

	}
	
	void reverseindex() {
		int mark[]= {23,45,67,43,22};
		
		for(int i=mark.length-1;i>=0;i--) {
			System.out.println(mark[i]);
			
		}
	}

}

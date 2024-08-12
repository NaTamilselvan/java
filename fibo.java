
import java.util.Scanner;

public class fibanoci {

	public static void main(String[] args) {
         
		int f=0,s=1;
	
		
		System.out.println("Enter the number");
		
		Scanner scan=new Scanner(System.in);
		
		int number=scan.nextInt();
			
		//System.out.print(f+" ");
		
		for(int i=0;i<=number;i++) {
			
			System.out.print(f+" ");
			
			int third=f+s;
		
			//System.out.print(third+" ");
			
			
			f=s;
			
			s=third;
			
			
		}
		
		
		 

	}

}

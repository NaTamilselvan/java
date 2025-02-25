package feb21array;

//import a class required class
import java.util.*;

//import javax.sound.midi.SysexMessage;

public class Maximum {

	public static void main(String[] args) {
	
		//create Scanner class object because get from input running a progran scanner class
		
		//create integer type array
		
	int total=0;	
      Scanner	scan =new Scanner(System.in);
		int  mark[]=new int[5];
		
		System.out.println(mark.length);
		//The array values insert while program runes
		
		for(int i=0;i<mark.length;i++) {
			
			 System.out.println("Enter the value  of "+mark[i]);
		mark[i]	=scan.nextInt();
			
		total+=mark[i];
		}
		
		System.out.println("The marks are ");
		
		for(int i=0;i<mark.length;i++) {
			
			System.out.println(mark[i]);
		}
		
		
		int max=mark[0];
		int minn=mark[0];
		for(int i=1;i<mark.length;i++) {
		
			if(mark[i]>max) {
				max=mark[i];
			}
			else {
				minn=mark[i];
			}
			
		}
		
		System.out.println("The maximum number"+max);
		
		
		int min=mark[0];
		
		for(int i=1;i<mark.length;i++) {
			if(min>mark[i]) {
				min=mark[i];
			}
		}
		
		System.out.println("The minimum value is "+min);;
		
		
		System.out.println("The minimum value is "+minn);;
		
		
		
		
		

	}

}

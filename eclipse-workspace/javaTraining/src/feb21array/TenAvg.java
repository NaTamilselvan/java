package feb21array;

import java.util.*;
public class TenAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 
          int total=0;		 
		 int  marks[]=new int[5];
		 
		 for(int i=0;i<=marks.length;i++) {
			 marks[i]=scan.nextInt();
			 total+=marks[i];
		 }
		 System.out.println("The total mark is "+total);

		 int avg=total/marks.length;
		 
	}

}

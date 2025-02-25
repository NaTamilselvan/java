package feb21array;

import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan=new Scanner(System.in);
		
		
		int[] marks = {94, 26, 91, 10,92};
		int min = marks[0]; 
		for(int i=1; i<marks.length; i++)
		{
		if(marks[i]<min)
		    min = marks[i]; 
		}
		System.out.println(min);
		

	}

}

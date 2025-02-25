package com.loop;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=7;i++) {
		
			for(int j=1;j<=7;j++) {
				
				if((j==1)|| (i+j==5 && i<=4)||(((i+j)%2)!=0 && (i>4)&&(j<4))) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}

}
//(i+j)%2!=0 &&( (i>4) &&(j<5)
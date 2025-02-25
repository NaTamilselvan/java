package com.loop;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=7;i++) {

			for(int j=1;j<=7;j++) {
				
				if((i==j && i<=4) ||(i+j==8 && i<=4) ||(j==1)||(j==7)){
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
			
			
			
		}

	}

}

//if((col==row && col<=4) ||col==1 || col==7|| (col+row==8 && row<=4))

//if((col==row && col<=4) ||col==1 || col==7|| (col+row==8 && row<=4))
package com.loop;

//import javax.sound.midi.SysexMessage;

public class INteher {

	

	public static void main(String[] args) {
		
		
		//decimal number system(0-9)
		
		//hexdecimal(0-F),octal(0-7) and binary(0,1)
		
for(int i=0;i<4;i++) {
	
	
	for(int j=0;j<=6;j++) {
		if(j<4 && i+j==3  ||  j>3 && j-i==3   )
			
		System.out.print(i+j);
		
		else if(i==2 &&(j>1 && j<3)) {
			System.out.print(" *");
		}
		
		  else {
				System.out.print(" ");
			          }
	     }
	
	   
	System.out.println();
}



String s1=new String ("Tamil");

String s2=new String ("Tamil");

String s3="Tamil";

System.out.println(s1==s2);

System.out.println(s1.equals(s2));

System.out.println(s1==s3);


StringBuffer sb1=new StringBuffer ("Tamil");

//String s2=new String ("Tamil");

StringBuffer sb2=new StringBuffer ("Tamil");


System.out.println(sb1.equals(sb2));

System.out.println(sb1==sb2);
		

		
	}

}

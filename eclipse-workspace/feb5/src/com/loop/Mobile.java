package com.loop;

public class Mobile {
	
	  static String  shop_name="Tamil_mobile_shop";
	  
	  int ram;
	  
	  int display_size;
	  
	  int speaker;
	  
	  int camara;
	  
	 int pliughole;
	  
	 
	 void on_mobile() {
		 System.out.println("the mobile is on");
	 }

	 void openAPP() {
	  System.out.println("open the Application");	 
		 
	 }
	 
	 void opencamer() {
		 System.out.println("open the camera ");
		 
	 }
	 void closecamera() {
		 
		 System.out.println("close the camera");
	 }
	 
	 void charging() {
		 System.out.println("chargring the mobile");
		 
	 }
	 
	 void chargeout() {
		 
		 System.out.println("out the charge");
	 }
	 
	public static void main(String[] args) {
		
		  Mobile lenvo=new Mobile();
		
		  lenvo.on_mobile();
		  
		  lenvo.openAPP();
		  
		  lenvo.opencamer();
		  
		  lenvo.closecamera();
		
           
	}

}

package com.loop;

public class Tv {

	static  String name="Kaliner";
	
	int display_size;
	
	void increase_volume() {
		System.out.println("The tv value is increase");
	}
	
	void decrease_volume() {
		System.out.println("The tv value is decrease");
	}
	
	void on_tv() {
		
		System.out.println("The is power on");
	}
	
	void offtv() {
		
		System.out.println("the tv is off");
	}
	
	void increase_chaneel() {
		
		System.out.println("the chanel increase");
		
	}
	
	void decrease_channer() {
		System.out.println("The channel is drecrese");
	}
	
	
	public static void main(String[] args) {
		

		  Tv tv=new Tv();
		  
		  tv.on_tv();
		  tv.increase_volume();
		  
		  tv.increase_chaneel();
		  tv.decrease_volume();
		  
		
	}

}

package com.loop;

public class House {
	
	
	int rooms;
	
	int windows;
	
	int doors;
	
	int bed_room;
	
	void opendoor() {
		System.out.println("The door is open");
	}
	

	void closedoor() {
		System.out.println("The door is close");
	}

	void openwindow() {
		System.out.println("The window  is open the window ");
	}
	
	void closewindow() {
		System.out.println("The door is window is close ");
	}
	
	

	public static void main(String[] args) {
		

		House room=new House();
		
		System.out.println(room);
		
		room.opendoor();
		
		room.openwindow();
		

		
		room.closewindow();
		
	}
	
	

}

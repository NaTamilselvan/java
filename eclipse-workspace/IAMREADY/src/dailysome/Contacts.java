package dailysome;


class Contact{
	
	String name;
	
	long number;
	
	Contact(String name,long number){
		
		this.name=name;
		this.number=number;
		
	}
		
}



public class Contacts {

	
	public static void main(String[] args) {
		
          Contact[] contact=new Contact[5];

		  Contact c1=new Contact("Tamil",444444);
		  
		  System.out.println(c1);
		  
		  System.out.println(contact);
		  
		  contact[0]=c1;
		  
		  System.out.println(contact[0]);
		  	
	
	}
}

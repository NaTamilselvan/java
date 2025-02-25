package Stringsss;

public class Whatsapp {

	            String contact_name;
	            long phone_number;
	
	Whatsapp(){
		
		super();
		
		System.out.println("Welcome to Whatsapp");		
	}
	
	Whatsapp(String contact_name,long phone_number){
		this();
		this.contact_name=contact_name;
		this.phone_number=phone_number;
		
		
	}
	            
	            
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Whatsapp Tamil=new Whatsapp("Tamil_selvan",8778685072l);
		    
		    Whatsapp Selvan=new Whatsapp("selvan",9659063632l);
		    
		    Whatsapp Chinu_samy=new Whatsapp("Chinu_samy",9865144958l);
		    
		    
		   System.out.println( Tamil.comapre(Selvan));
		  //  Tamil.call();

		    
		
		
		
	}

	private void call() {
		// TODO Auto-generated method stub
		
		//System.out.println("Iam calling to chinusamy");
		
	}

	private int  comapre(Object o) {
		// TODO Auto-generated method stub
		      Whatsapp samy= (Whatsapp) o;
		      System.out.println(samy.contact_name);
		      System.out.println(samy.phone_number);
		System.out.println(o);
		if(this.contact_name==samy.contact_name)
			return 0;
		else if(this.phone_number > samy.phone_number)
			return +1;
           else 
        	   return -10;
		
	}

}

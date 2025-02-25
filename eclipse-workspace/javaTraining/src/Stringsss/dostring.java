package Stringsss;

public class dostring {
    public static Object f;
	int price,ram;
    
	
	public dostring(int i) {
		// TODO Auto-generated constructor stub
		
		
	}
	public dostring(int price, int ram) {
		// TODO Auto-generated constructor stub
		this.price=price;
		this.ram=ram;
	}
	
	dostring (){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dostring f=new dostring(); 
		
		String s=new String("abcd");
		System.out.println(s);
		
		dostring d=new dostring(12000,4);

		dostring d2=new dostring(13000,6); 
		System.out.println(d);
		
		System.out.println(d.equals(d2));
		System.out.println(d.hashCode());
		
		 Mobile m=new Mobile();
		 
		 System.out.println(m);
		
		
	}
	
	
	public int hashCde()
	  {
	    return 1233444;
	  }
	public boolean equals( Object o) {
		
		int price=this.price;
		int price2=((dostring)o).price;
		
		if(price==price2)
			return true;
		return false;
		
	}
	
	public String toString()
	  {
	    return this.price +" ";
	  }

}

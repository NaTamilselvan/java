package Stringsss;

public class Mobile implements Comparable{
	
	int price;
	int ram;
	public Mobile(int price,int ram) {
		
		super();
		this.price=price;
		this.ram=ram;
		
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mobile 	samsung=new Mobile(12000,4);
	
	Mobile 	apple=new Mobile(18200,6);
	
	System.out.println(samsung.compareTo(apple));
	
	

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		System.out.println(this.price);
		System.out.println(this.ram);
		
		 Mobile d=(Mobile)o;
		System.out.println(d.ram);
		System.out.println(d.price);	
		System.out.println();
		
		if(this.price>d.price) {
			return +1;
			
		}else if(this.price<d.price) {
			return -1;
		}
		else
		
		return 0;
	}

}

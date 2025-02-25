package StringPrograms;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String name="Tamilselvan";
		
		String name2=new String("Tamilselvan");
		
		char[] name3= {'T','a','m','i','l'};
		
		
		if ( name == name2) {
			
			System.out.println("The reference are equal");
		}
		
		else {
			System.out.println("The reference not equal");
		}
		

	}

}



/*import Durgasoft.src.Arrays;


public class Arrays {

	public static void main(String[] args) {
		
		
		//why array if store more then one value use array why array concept is
		//inveted because you store 20 students values how many varaible is
		//created as a good devaloper use memeory efficent and that code use micro to mano
		
		/* variable creation limtations
		 * 
		 * 1. variable creation is difficult 
		 * 2.remebering  the  multiple names and accessing them is difficult ./ 
		 */
		
		//array decleartion 
		//array creation
		//array installiaztion
		//arrray decleartion and array creation and array instailation in asingle line 
		
		int[] a;
		
		//when a array decleartion array not specify the size
		
		//one dimaensional array;
		
		int[] b;  int []c;  int d[];
		
		//they are everything vaild but recomdeded first 
		
		int[] f;
		
		//if trying array decleartion area to provide size you will get compile time error
		
		//int[2] a;
		
		
		

	}

}




/* public class Refernce {

int a;

double b;

char c;
	
public Refernce(int i, double d, char e) {
	
this.a=i;
this.b=d;
this.c=e;
	
}

public static void main(String[] args) {
	
	
	Refernce r=new Refernce(10,2.4,'e');
	
	Refernce e;
	
	r=e;
	
	System.out.println(r);

	System.out.println(e);
	

}

}*/



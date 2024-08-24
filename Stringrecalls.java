
public class Stringrecall {

	public static void main(String[] args) {
		
		String s="tamil";
		String s2=new String("tamil");
		String s3="tamil";
		
		if (s==s2) {
			System.out.println("THey values are equals");
		}
		else {
			System.out.println("Not equal");
		}
		
        if(s.equals(s3)) {
        	System.out.println("Equal method working");
        }
        else {
        	System.out.println("Equal not method working");
        }
		
		

	}

}


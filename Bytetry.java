package jaw;

public class Bytetry {
	
	public static int reverseNumer(int num) {
		
		String reverseNumber="";
		while(num!=0) {
			
			reverseNumber+=num%10;
			
			num=num/10;
			
			
			
		}
		int rev=Integer.parseInt(reverseNumber);
		
		return rev;
		
	}
	
	
	public static boolean isPalindrome(int n){
		
		
		String s=String.valueOf(n);
		
	//	int[] num=new int[s.length()];
		
		//for(int i = 0;i < s.length() ; i++) {
			
			//num[i]=s.charAt(i)-'0';
		//}
		
		boolean b=true;
		
		for(int i=0,j=s.length()-1;i<=j;i++,j--) {
			
			if(s.charAt(i)==s.charAt(j)) {
				
				
			}
			else {
				b=false;
			}
		}
		return b;
		
	}
	
	public static boolean isPrime(int a) {
		
		boolean b=true;
		for (int i=2;i<=a/2;i++) {
			
			if (a%i==0) {
				b=false;
			}
		}
		
		return b;
		
	}
	public  static int factorial(int fact) {
		
		
		int f=1;
		while(fact!=0) {
			
			f*=fact;
			
			fact--;
		}
		
		return f;
		
		/*
		 * if(fact==1 || fact==0) {
		 * 
		 * return 1; }
		 * 
		 * 
		 * return factorial(n-1)* factorial(n-2);
		 */
	}
	
	
	public static void sumAndDigit(int a) {
		
		int sum=0,digit=0,large=0;
		
		while(a!=0) {
			
			
			if(a%10>large) {
				large=a%10;
			}
			
			
			sum+=a%10;
			
			a=a/10;
			
			digit++;
			
		}
		
		System.out.println("THe sum is "+sum+" The no of digit is "+digit+" The largest number is "+large);
		
	}

	
	public static void fibonoci(int f) {
		
		int first=0 , secound=1,i=1;
		
		int thired=0;
		
		while(i<=f) {

			System.out.println(first+" ");
			
			thired=first+secound;
			
			first=secound;
			
			secound=thired;
			
			
			
			i++;
		}
		
	}
	
	
	public static void amstrong(int a){
		
		int sum=0;
		
		int b=a;
		
		while(b!=0) {
			
			int result= b%10 ;
			
			sum+=result*result*result;
			
			b= b/10 ;
		}
		
		if(a==sum) {
			System.out.println(" Amstrong number ");
		}
		else {
			System.out.println("Not Amstrong");
		}
		
	}
	
	public  static void  prims() {
		System.out.println(1);
		for(int i=1;i<=100;i++) {
			
			boolean yes=true;
		
			//System.out.println(2);
			for(int j=2;j<=i/2;j++) {
				//System.out.println(4);
				if(i%j==0) {
					yes=false;
					//System.out.println(1);
					//System.out.println("Not a prime number"+i);
					break;
				}
				
			}
			
			if(yes) {
			System.out.println("The prime numbers is "+i);}
		}
	}
	public static void main(String[] args) {
		
		
		//System.out.println(reverseNumer(12341));
		
		//System.out.println(isPalindrome(121));
		
		//System.out.println("This prime "+isPrime(8));
		
		//System.out.println(factorial(5));
		
		// fibonoci(10);
		
		//sumAndDigit(129345);
		
		//prims();
		
		amstrong( 91 );
		byte a=127;
		
		byte b=111;
		
		
		//byte c=(byte)(a*b);
		
		float aa=9f;
		
		float bb=aa / 2;
		
		System.out.println(  );
		
		
	}

}

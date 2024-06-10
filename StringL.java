import java.util.Scanner;

class  StringL{


public static boolean isPalindrome(String ss){

  
   for(int i=0,j=ss.length()-1;i<=j;i++,j--){

       if( ss.charAt(i)!=ss.charAt(j) ){
                 return false;
               }
    

    }  
   return true;





}


public static void main(String[] args){


  Scanner scan=new Scanner(System.in);

   System.out.println("Enter your String");

   String ss=scan.nextLine();

boolean b=isPalindrome(ss);

 if(b==true){

 System.out.println("This string is palindrome");
       }
 else 
    System.out.println("This string is not palindrome");

}


}


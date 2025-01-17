 import java.util.Scanner;
public class pracket1 {
    public static void main(String args[])
 {
     Scanner scan= new Scanner(System.in);  
     String s=scan.nextLine();
     int pracket=0;
     int count=0;
     for(int i=0;i<s.length();i++)
     {
         char c=s.charAt(i);
         if(c=='(')
         {
          pracket++;
         }
         else{
             if(pracket<=0)
             {
                 count++;
             }
             else{
                 pracket--;
             }
         }
        
     }
     System.out.println(pracket);
        
    }

    
}
    


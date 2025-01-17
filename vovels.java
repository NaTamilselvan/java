  import java.util.Scanner;
  public class vovels {
     public static void main(String[] args)
     {
         Scanner scan=new Scanner (System.in);
         int count=0;
        String  s=scan.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') 
            
            {
                count++;
            }
        }
        System.out.println(count);

     }

    
}

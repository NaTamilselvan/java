import java.util.Scanner;

class ThreadTesst{

public static void  add(){

System.out.println("The add is starting ");

Scanner scan=new Scanner(System.in);

System.out.println("Enter the a value ");

int a=scan.nextInt();

System.out.println("Enter the b value ");

int b=scan.nextInt();

System.out.println("The output is "+b);

System.out.println("The add is ending ");

}



public static  void printachar() throws Exception{

for(int i=0;i<=65;i++){

//Thread.sleep(4000);
System.out.println((char)i);

}

}


public static  void printanum(){

   for(int i=1;i<=10;i++){

     try{
//        Thread.sleep(5000);
        System.out.println(i);

         }
     catch(Exception e ){

      System.out.println("Distrup state exception");

                         }
                        }


                               }



}


public class Testtt{


public static void main(String[] args) throws Exception{


ThreadTesst.add();

ThreadTesst.printachar();

ThreadTesst.printanum();

}

}





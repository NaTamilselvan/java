import java.util.Scanner;
class Ta2{

public void fun2(){


System.out.println("connection establish in Ta2 fun1 method ");

System.out.println("Enter the size of array");

 Scanner scan =new Scanner(System.in);

int  size=scan.nextInt();

long [] a=new long [size];


System.out.println("connection terminate Ta2 fun2 method ");

}


}


class Ta1{

 public void fun1(){

System.out.println("connection establish in Ta1 fun1 method ");
 Ta2 t=new Ta2();
   
try {
t.fun2();}
catch(Exception e ){

  System.out.println("program is terminated ");

                   }


System.out.println("connection terminate Ta1 fun1 method ");


}
}

class Ta{

void fun(){

   Ta1 t1=new Ta1();

   t1.fun1();


}

}

public class Trial5{

public static void main(String[] args){

 Ta tt= new Ta();
  tt.fun();

}

}

 class Immutableclass{

private int i=10;

public Immutableclass getMethod(int i){


if(this.i==i){

     return this;

}
else {

    return  new Immutableclass (i);
}


}


}

class Trial1{


public static void main(String[] args ){

  Immutableclass i=new Immutableclass();


  Immutableclass i2=new Immutableclass();


  Immutableclass i3=new Immutableclass();

   System.out.println(i==i2);
  
  
   System.out.println(i==i3);

}


}
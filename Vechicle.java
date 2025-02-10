public abstract class Vechicle{


public abstract int  getNoOfVechicle();

public static void main(String[] args){

Bike b=new Bike();

int num=b.getNoOfVechicle();

System.out.println(num);

}




}

class Bus extends Vechicle{

public int getNoOfVechicle(){


return 2;
}



}


class Bike extends Vechicle{

public int getNoOfVechicle(){


return 2;
}



}

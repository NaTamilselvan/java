public class Kan1{

private int i;


 public Kan1(int i){


   this.i=i;

          }

public Kan1 tomodifys(int i){

if(i==this.i){

return this;
              }
else{

return new Kan1(i);

     }

                          }





}





import java.util.*;

import java.util.Map.Entry;
class Mapint{

public static void main(String[] args){


 HashMap<String,Integer> h=new HashMap<String,Integer>();

System.out.println( h.put("idely",8));

System.out.println( h.put("dosai",12));

System.out.println( h.put("ponda",22));

System.out.println( h.put("ponda",23));



 Set keys=h.keySet();

       Set entrys=h.entrySet();

        for(Object o:entrys){

                      Entry entry=(Entry)o;

                      System.out.println("THe key values is "+entry.getKey()+"----->"+entry.getValue());
                }

       Set entrys2=h.entrySet();
    
       for( Object o:entrys2){
                           Entry ee=(Entry)o;

                     String item_name = (String) ee.getKey();

                    if(item_name.equals("Ideli")){
               System.out.println("The prise is "+ee.getValue());}

}
                   }


}

     //  Map hs=hm.desendingEntry();







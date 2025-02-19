public class Note{

	static  String  noteName="Tamil Notes";

	private short pages;

	public void setPages(short no){

		pages=no;


		
	}
	public short getPages(){



		return pages;
	}






	public static void main(String[] args){

                 Note  n=new Note();


                   n.setPages( (short)200);
		   System.out.println(n.getPages());

	}


}




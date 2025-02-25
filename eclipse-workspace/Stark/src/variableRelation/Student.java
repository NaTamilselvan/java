package variableRelation;

public class Student {
	
	String name;
	
	int mark;
	
	
	void attendExam() {
		
		System.out.println("I am attend the exam");
		System.out.println(name);
		System.out.println(mark);
		
	}
	
    void writeExam() {
		
		System.out.println("I am attend the exam");
		
	}
	
    void endExam(){System.out.println("I am attend the exam");}
		
		
		
	
    
	public static void main(String[] args) {
		
		
		Student s ;
		
		s=new Student();
		
		s.mark=99;
		
		System.out.println();
		
		s.attendExam();
		
		s.writeExam();
		
		s.endExam();
		
		//System.out.println(s.name);
		
		
			
		}

}

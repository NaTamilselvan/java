import java.util.StringTokenizer;

public class Stringtok {

	public static void main(String[] args) {
		
		
		
		String s="JAva Python sql html";
		
		StringTokenizer ss=new StringTokenizer(s);
		
		while(ss.hasMoreTokens()) {
			System.out.println(ss.nextToken());
		}

	}

}

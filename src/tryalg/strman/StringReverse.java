package tryalg.strman;

public class StringReverse {

	static String reverse1(String str){
		char[] chars=str.toCharArray();
		String output="";
		for (int i=chars.length-1;i>=0;i--) {
			output+=chars[i];
		}
		return output;
	}
	public static void main(String[] args) {
		System.out.println(reverse1("peter"));
	}

}

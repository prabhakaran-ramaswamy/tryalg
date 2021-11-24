package tryalg.strman;

public class WordReverse {

	static String reverse1(String str,String splitter){
		String[] data= str.split(splitter);
		String output="";
		for(int i=data.length-1;i>=0;i--) {
			output+=data[i]+" ";
		}
		return output;
	}
	public static void main(String[] args) {
		System.out.println(reverse1("Hello world"," "));
	}
}

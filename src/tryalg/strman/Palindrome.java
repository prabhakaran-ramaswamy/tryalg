package tryalg.strman;

public class Palindrome {
	static boolean isPalindrome(String str){
		str=str.replaceAll("\\s", "");
		char[] chars=str.toCharArray();
		for(int i=0,j=chars.length-1; i<j;i++,j--) {
			if(chars[i]!=chars[j]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("ΝΙΨΟΝ ΑΝΟΜΗΜΑΤΑ ΜΗ ΜΟΝΑΝ ΟΨΙΝ"));
	}
}

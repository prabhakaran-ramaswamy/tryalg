package tryalg.strman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {
	
	static List<String> getSinglePermutation(String str1,String str2){
		List<String> listOfPermutation= new ArrayList<String>();
		for(int i=0;i<=str2.length();i++) {
			listOfPermutation.add(new StringBuilder(str2).insert(i, str1).toString());
		}
		
		return listOfPermutation;		
	}
	
	public static void main(String[] args) {
		Set<String> allPermutation= new HashSet<String>();
		String str="ABC";
		for(int i=0;i<str.length();i++) {
			String a = str.substring(i,i+1);
			System.out.println(a);
			String b = str.substring(0,i).trim()+str.substring(i+1).trim();
			System.out.println(b);
			System.out.println(b.length());
			allPermutation.addAll(getSinglePermutation(a,b));
		}
		System.out.println(allPermutation);
		System.out.println(new StringBuilder("AB").insert(1, "C").toString());
	}
}
//'cba'.28-Nov-2016

package tryalg.interview;

import java.util.HashMap;
import java.util.Map;

public class FindStrAnyform {
	static String find(String str, String[] arr) {
		char[] chars = str.toCharArray();
		Map<Character, Integer> counts = new HashMap<Character, Integer>();
		for (char c : chars) {
			if (counts.containsKey(c)) {
				counts.put(c, counts.get(c) + 1);
			} else {
				counts.put(c, 1);
			}
		}
		for (String tStr : arr) {
			char[] tchars = tStr.toCharArray();
			Map<Character, Integer> tCounts = new HashMap<Character, Integer>();
			for (char c : tchars) {
				if (tCounts.containsKey(c)) {
					tCounts.put(c, tCounts.get(c) + 1);
				} else {
					tCounts.put(c, 1);
				}
			}
			boolean isPresent = true;
			for (char c : tCounts.keySet()) {
				if (isPresent && !counts.containsKey(c)) {
					isPresent = false;
				}
				if (isPresent) {
					int n = counts.get(c) - tCounts.get(c);
					isPresent = isPresent && n >= 0;
				}
			}
			if (isPresent) {
				return tStr;
			}

		}
		return null;
	}

	public static void main(String[] args) {
		String[] data = { "cat", "dog" };
		System.out.println(find("dstdcssadsd", data));
		System.out.println(find("dsgsssadsoi", data));
		System.out.println(find("sgsssasoi", data));
	}

}

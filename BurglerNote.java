package leetCode;

import java.util.HashMap;
import java.util.Map;

public class BurglerNote {
	static void checkMagazine(String[] magazine, String[] note) {
		Map<String, Integer> magString = new HashMap();
		String verdict = "No";
		for (String token : magazine) {
			if (magString.get(token) == null) {
				magString.put(token, 1);
			} else {
				magString.put(token, (int) magString.get(token) + 1);
			}
		}
		for (String noteToken : note) {
			if (magString.get(noteToken) != null
					&& magString.get(noteToken) != 0) {
				magString.put(noteToken, magString.get(noteToken) - 1);
			} else {
				System.out.println(verdict);
				return;
			}
			
		}

		System.out.println("Yes");

	}
	
	public static void main(String[] args) {
		String[] magazine = new String[]{"two", "times","Two", "three", "is", "not", "four"};
		String[] note = new String[]{"Two", "times", "two", "is", "four"};
		
		checkMagazine(magazine, note);
	}
}

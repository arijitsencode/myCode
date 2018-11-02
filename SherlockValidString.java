package leetCode;

import java.util.HashMap;
import java.util.Map;

public class SherlockValidString {

	// Complete the isValid function below.
	static String isValid(String s) {
		Map<Character, Integer> numCnt = new HashMap<Character, Integer>();
		Map<Integer, Integer> freqCnt = new HashMap<Integer, Integer>();
		for (Character c : s.toCharArray()) {
			if (numCnt.get(c) != null) {
				numCnt.put(c, numCnt.get(c) + 1);
			} else {
				numCnt.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> ent : numCnt.entrySet()) {
			if (freqCnt.get(ent.getValue()) != null) {
				freqCnt.put(ent.getValue(), ent.getValue() + 1);
			} else {
				freqCnt.put(ent.getValue(), 1);
			}
		}

		if (freqCnt.size() > 2)
			return "NO";
		int[] max = new int[2];
		int[] max1 = new int[2];
		int idx = 0;
		for (Map.Entry<Integer, Integer> ent : freqCnt.entrySet()) {
			max[idx] = ent.getValue();
			max1[idx] = ent.getKey();
			idx++;
		}
		if (max[0] > max[1]) {
			if (max[1] > 1)
				return "NO";
		} else {
			if (max[0] > 1)
				return "NO";
		}
		boolean genCntMore = max[0] > max[1] ? max1[0] > max1[1]
				: max1[0] < max1[1];
		int genCount = max[0] > max[1] ? max1[0] : max1[1];

		for (Map.Entry<Character, Integer> ent : numCnt.entrySet()) {
			if (genCount != ent.getValue()) {
				if (genCntMore) {
					if (genCount < ent.getValue()) {
						if (ent.getValue() - genCount <= 1)
							return "YES";
						else
							return "NO";
					} else {
						if (ent.getValue() - genCount <= -1)
							return "YES";
						else
							return "NO";
					}
				}else{
					if (genCount < ent.getValue()) {
						if (ent.getValue() - genCount <= 1)
							return "YES";
						else
							return "NO";
					} else {
						if (ent.getValue() - genCount <= -1)
							return "YES";
						else
							return "NO";
					}
				}

			}

		}
		return "YES";
	}

	public static void main(String[] args) {
		System.out.println(isValid("abbac"));
	}

}

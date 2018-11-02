package leetCode;

public class Palindrome {

	/**
	 * @param args
	 */
	boolean isPalindrome(int a) {
		if (a > 0) {
			return isPalindrome(a + "");
		} else
			return false;
	}

	boolean isPalindrome(String a) {
		StringBuffer sb = new StringBuffer();
		char[] arr = a.toCharArray();
		for (int offset = a.length() - 1; offset >= 0; offset--) {
			sb.append(arr[offset]);
		}
		System.out.println("Reversed string::" + sb.toString());
		if (sb.toString().equalsIgnoreCase(a)) {
			return true;
		}

		return false;
	}

	int longestSubStringPalindrome(String a) {
		int palLength = 0;
		String tmpStr = null;
		for (int index = 0; index < a.length() - 1; index++) {
			for (int index1 = 0; index1 <= a.length() - index; index1++) {
				tmpStr = a.substring(index, index + index1);
				if (isPalindrome(tmpStr)) {
					if (tmpStr.length() > palLength)
						palLength = tmpStr.length();
				}
			}
		}
		return palLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(new Palindrome().isPalindrome("Madam"));
		// System.out.println(new Palindrome().isPalindrome(11000011));
		System.out.println(new Palindrome()
				.longestSubStringPalindrome("mammaamwmamw"));
	}

}

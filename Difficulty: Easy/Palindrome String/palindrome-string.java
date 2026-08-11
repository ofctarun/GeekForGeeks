class Solution {
	boolean isPalindrome(String s) {
		// code here
		int i = 0, j = s.length() - 1;
		boolean flag = true;
		
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		return flag;
	}
}

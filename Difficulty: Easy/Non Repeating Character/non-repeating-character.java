class Solution {
	public char nonRepeatingChar(String s) {
		// code here
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char c : s.toCharArray())
			map.put(c, map.getOrDefault(c, 0) + 1);
		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				return c;
			}
		}
		return '$';
	}
}

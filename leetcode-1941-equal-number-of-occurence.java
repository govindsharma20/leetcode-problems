class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        Set<Integer> frequencies = new HashSet<>(charCounts.values());

        return frequencies.size() == 1;
    }
}

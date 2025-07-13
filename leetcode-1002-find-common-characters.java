class Solution {
    public List<String> commonChars(String[] words) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        int[] minFrequencies = new int[26];
        Arrays.fill(minFrequencies, Integer.MAX_VALUE);

        for (String word : words) {
            int[] currentFrequencies = new int[26];
            for (char c : word.toCharArray()) {
                currentFrequencies[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFrequencies[i] = Math.min(minFrequencies[i], currentFrequencies[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFrequencies[i]; j++) {
                result.add(String.valueOf((char) ('a' + i)));
            }
        }

        return result;
    }
    
}

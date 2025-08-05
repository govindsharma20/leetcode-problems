class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueFrequencies = new HashSet<>();
        for (int count : frequencyMap.values()) {
            if (!uniqueFrequencies.add(count)) {
                return false;
            }
        }

        return true;
    }
}

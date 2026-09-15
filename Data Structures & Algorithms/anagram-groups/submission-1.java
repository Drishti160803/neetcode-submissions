class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // 1. Count the frequency of each letter (a-z)
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            
            // 2. Convert the count array into a direct String key
            // Example: [1, 0, 1, 0...] becomes "[1, 0, 1, 0...]"
            String key = Arrays.toString(count);
            
            // 3. Put it in the map (computeIfAbsent creates a new list if it doesn't exist)
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int l = 0;
        int max = 0;
        HashSet<Character> st = new HashSet<>();
        for(int r = 0; r< s.length(); r++){
            char curr = s.charAt(r);
            while(st.contains(curr)){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(curr);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}

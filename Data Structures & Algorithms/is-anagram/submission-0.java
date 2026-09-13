class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char arr[] = s.toCharArray();
        char brr[] = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int left = 0;
        int right = 0;
        while(left < s.length() && right < t.length()){
            if(arr[left] != brr[right]){
                return false;
            }
            left++;
            right++;
        }
        return true;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int maxfreq  = 0;
        int maxlength = 0;
        int[] counts = new int[26];
        for(int r = 0; r< n;r++){
            char currRightchar = s.charAt(r);
            counts[currRightchar - 'A']++;
            maxfreq = Math.max(maxfreq , counts[currRightchar - 'A']);
            int currentWindowLength = r - l + 1;
            int diff = currentWindowLength - maxfreq;
            while(diff > k){
                char currentLeftChar = s.charAt(l);
                counts[currentLeftChar - 'A']--;
                l++;
                currentWindowLength = r - l + 1;
                diff = currentWindowLength - maxfreq;
            }
            maxlength = Math.max(maxlength, r - l + 1);
        }
        return maxlength;
        
    }
}

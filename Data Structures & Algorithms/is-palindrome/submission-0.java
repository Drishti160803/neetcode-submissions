class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() -1;
        while(left< right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{
                char leftchar = Character.toLowerCase(s.charAt(left));
                char rightchar = Character.toLowerCase(s.charAt(right));
                if(leftchar != rightchar){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

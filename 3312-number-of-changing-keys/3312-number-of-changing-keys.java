class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1) || s.charAt(i) == s.charAt(i - 1) - 32 || 
            s.charAt(i) == s.charAt(i - 1) + 32){
                continue;
            }
            count++;
        }
        return count;
    }
}
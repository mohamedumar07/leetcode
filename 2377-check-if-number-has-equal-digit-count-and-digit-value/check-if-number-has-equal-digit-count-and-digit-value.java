class Solution {
    public boolean digitCount(String num) {
        int[] nums = new int[10];
        for(char c: num.toCharArray()){
            nums[c - '0']++;
        }

        for(int i = 0; i < num.length(); i++){
            if((num.charAt(i) - '0') != nums[i]){
                return false;
            }
        }

        return true;
    }
}
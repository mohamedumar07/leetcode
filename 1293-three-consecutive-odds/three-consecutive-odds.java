class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int consCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0){
                consCount++;
                if(consCount == 3){
                    return true;
                }
            }
            else{
                consCount = 0;
            }
        }
        return false;
    }
}
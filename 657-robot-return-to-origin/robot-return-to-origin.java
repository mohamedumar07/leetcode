class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0;
        int up = 0;
        for(char c: moves.toCharArray()){
            if(c == 'L'){
                left++;
            }else if(c == 'R'){
                left--;
            }
            else if(c == 'U'){
                up++;
            }else if(c == 'D'){
                up--;
            }
        }
        return (up == 0 && left == 0);
    }
}
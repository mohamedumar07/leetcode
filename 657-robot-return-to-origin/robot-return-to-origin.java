class Solution {
    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int down = 0;
        int up = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                left++;
            }else if(moves.charAt(i) == 'R'){
                left--;
            }
            else if(moves.charAt(i) == 'U'){
                up++;
            }else if(moves.charAt(i) == 'D'){
                up--;
            }
        }
        return (up == 0 && left == 0);
    }
}
class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            num = sumDigits(num);
        }
        return num;
    }

    public int sumDigits(int num){
        int sum = 0;
        while(num > 0){
            sum = (num  % 10) + sum ;
            num /= 10;
        }
        return sum;
    }
}
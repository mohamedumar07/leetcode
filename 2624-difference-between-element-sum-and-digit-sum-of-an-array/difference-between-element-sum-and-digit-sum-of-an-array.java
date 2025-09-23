class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumOfDigits = 0;
        for(int num : nums){
            sum += num;
            sumOfDigits += digitSum(num);
        }
        System.out.println(sumOfDigits);
        return Math.abs(sum - sumOfDigits);
    }

    public int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
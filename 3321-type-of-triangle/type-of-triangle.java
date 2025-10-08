class Solution {
    public boolean isEquilateral(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1])
                return false;
        }
        return true;
    }

    public boolean isScalene(int[] nums){
        int n = nums.length;
        int prefixSum = 0;
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
        }

        for(int i = n - 1; i >= 0; i--){
            int temp = nums[i];
            if((prefixSum -  temp) <= temp)
                return false;
        }

        return true;
    }

    public boolean isIsosceles(int[] nums){
        int n = nums.length;
        int unique = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            unique ^= nums[i];
            sum += nums[i];
        }

        for(int i = 0; i < n; i++){
            if(nums[i] == unique && (sum - unique) > unique)
                return true;
        }
        return false;
    }

    public String triangleType(int[] nums) {
        if(isEquilateral(nums)){
            return "equilateral";
        }else if(isIsosceles(nums)){
            return "isosceles";
        }else if(isScalene(nums)){
            return "scalene";
        }else{
            return "none";
        }
    }
}
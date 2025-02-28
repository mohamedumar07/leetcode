class Solution {
    public static List<Integer> generateRow(int n){
        List<Integer> result = new ArrayList<>();
        int ans = 1;
        result.add(ans);

        for(int i = 1; i < n; i++){
            ans = ans * (n - i);
            ans = ans / i;
            result.add(ans);
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals = new ArrayList<>();
        
        for(int i = 1; i <= numRows; i++){
            pascals.add(generateRow(i));
        }

        return pascals;
    }
}
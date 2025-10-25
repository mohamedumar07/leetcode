class Solution {
    public int getLucky(String s, int k) {
        int result = 0;
        String transformed = convertStringToInt(s);
        for(int i = 0; i < k; i++){
            result = 0;
            for(char c: transformed.toCharArray()){
                result += c - '0';
            }
            if(i != k - 1){
                transformed = String.valueOf(result);
            }
        }
        return result;
    }

    public String convertStringToInt(String s){
        StringBuilder temp = new StringBuilder();
        for(char c: s.toCharArray()){
            temp.append((c - 96));
        }
        return temp.toString();
    }
}
class Solution {
    public String toLowerCase(String s) {
        //A -> 65, a -> 97
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            char temp = c;
            if(c >= 65 && c <= 90){
                temp = (char) (c + 32);
            }
            result.append(temp);
        }
        return result.toString();
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabets = new int[26];

        for(char c: sentence.toCharArray()){
            alphabets[c - 'a']++;
        }

        for(int n: alphabets){
            if(n == 0)
                return false;
        }

        return true;
    }
}
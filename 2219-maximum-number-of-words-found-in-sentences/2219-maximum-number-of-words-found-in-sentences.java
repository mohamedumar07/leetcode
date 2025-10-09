class Solution {

    public int wordsCount(String text){
        int count = 1;
        for(char c: text.toCharArray()){
            if(c == ' '){
                count++;
            }
        }
        return count;
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int temp = 0;
        for(String sent: sentences){
            temp = wordsCount(sent);
            if(temp > max){
                max = temp;
            }
        }

        return max;
    }
}
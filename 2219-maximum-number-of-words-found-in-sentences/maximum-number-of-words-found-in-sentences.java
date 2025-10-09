class Solution {

    public int wordsCount(String text){
        return text.split(" ").length;
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
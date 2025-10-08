class Solution {
    public static boolean isPresent(String word, char x){
        for(char temp: word.toCharArray()){
            if(temp == x)
                return true;
        }
        return false;
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(isPresent(words[i], x)){
                list.add(i);
            }
        }
        return list;
    }
}
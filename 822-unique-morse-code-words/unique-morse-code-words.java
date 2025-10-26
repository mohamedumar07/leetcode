class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> unique = new HashSet<>();
        String code[] = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        for(String word: words){
            StringBuilder contd = new StringBuilder();
            for(char c: word.toCharArray()){
                contd.append(code[c - 97]);
            }
            unique.add(contd.toString());
        }

        return unique.size();
    }
}
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] characters = s.toCharArray();
        for(char c: characters){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < characters.length; i++){
            if(freq.get(characters[i]) < 2){
                return i;
            }
        }

        return -1;
        
    }
}
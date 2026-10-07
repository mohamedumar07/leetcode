import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for(String str: strs){
            int[] count = new int[26];

            for(char c: str.toCharArray()){
                count[c - 'a']++;
            }

            //creating an unqiue key to store value
            StringBuilder sb = new StringBuilder();
            for(int c: count){
                // | is to split the more than one digit collision to the
                // neighboring number due to sum.
                sb.append(c).append("|");
            }

            String key = sb.toString();
            System.out.println(key);

            if(!groupedAnagrams.containsKey(key)){
                groupedAnagrams.put(key, new ArrayList<>());
            }
            groupedAnagrams.get(key).add(str);
        }
        System.out.println(groupedAnagrams);
        return new ArrayList<>(groupedAnagrams.values());
    }
}
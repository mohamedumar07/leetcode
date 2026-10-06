import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList(Arrays.stream(strs)
        .collect(Collectors.groupingBy(word -> {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            return new String(letters);
        }
    ))
        .values());
    }
}
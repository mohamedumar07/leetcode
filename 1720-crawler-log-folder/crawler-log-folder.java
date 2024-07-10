import java.util.regex.*;

class Solution {
    public int minOperations(String[] logs) {
        Pattern pattern1 = Pattern.compile("\\w+");
        int level = 0;
        for(String dir: logs)
        {
            Matcher match = pattern1.matcher(dir);
            if(match.find()){
                level++;
            }
            else if(dir.startsWith("..") && (level > 0)){
                level--;
            }
        }
        return level;
    }
}
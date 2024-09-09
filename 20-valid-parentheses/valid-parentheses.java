import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> cha = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '[')
                cha.push(curr);
            else if(cha.size() < 1)
                return false;
            else{
                if(curr == '}' && cha.peek() == '{')
                    cha.pop();
                else if(curr == ')' && cha.peek() == '(')
                    cha.pop();
                else if(curr == ']' && cha.peek() == '[')
                    cha.pop();
                else
                    return false;
            }
        }
        return cha.size() > 0 ? false : true;
    }
}
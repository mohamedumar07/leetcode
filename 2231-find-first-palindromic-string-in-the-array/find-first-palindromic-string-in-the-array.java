class Solution {
     public static boolean isPalindrome(String word)
    {
        int low = 0;
        int high = word.length() - 1;
        while(high > low)
        {
            char l_w = word.charAt(low);
            char h_w = word.charAt(high);
            if(l_w != (h_w))
            {
                return false;
            }
            high--;
            low++;
        }
        return true;
    }
    public static String firstPalindrome(String[] words) {
        String res = "";
        for(String w : words)
        {
            if(isPalindrome(w))
            {
                res = w;
                break;
            }
        }
        return res;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length()-1;
        int left = 0;
        
        while ( right > left )
        {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
             if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
             {
                return false;
             }
            left++;
            right--;
        }
        return true;
        
    }
}
/* 1st draft
class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = s.length()/2;
        String forward,reverse;
        forward = s.substring(0,i); 
        reverse = s.substring(i);
        for(int j = 0 ; j < i;j++)
        {
            if(forward.charAt(j)!=reverse.charAt(reverse.length()-1-j))
            {
                return false;
            }
        }
        return true;
        
    }
}
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int l=0;

        for(int r=0;r<s.length();r++)
        {
            for(int i=l;i<r;i++)
            {
                if(s.charAt(i)==s.charAt(r))
                {
                    l=i+1;
                    break;
                }
            }
            int windowLen =r-l+1;
            if(windowLen > maxLength)
            {
                maxLength=windowLen;
            }
        }
        return maxLength;
        
    }
}
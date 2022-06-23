class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //NOTE:substring should be contiguous with no duplicates
        
        if(s.length()==0) //Edge case
            return 0;
        
        HashSet<Character> slideW=new HashSet<>();
        
        int left=0;
        int right=0;
        int res=0;
        
        int len=s.length();
        
        while(right<len)
        {
            if(!slideW.contains(s.charAt(right))) //Checking if the character already exists
            {
                slideW.add(s.charAt(right));   //if not add to set to form sub string
                
                right++;
            }
            else
            {
                slideW.remove(s.charAt(left));  //if it already exists, start removing the characters from the left till the duplicate char is deleted.
                
                left++;
            }
            
            res=Math.max(res, right-left);  //updating res
            
        }
        
        return res;
        
        
    }
}

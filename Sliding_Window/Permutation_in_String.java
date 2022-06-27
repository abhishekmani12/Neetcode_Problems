class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
       Map<Character, Integer> charCount= new HashMap<>();
       
        for(char c: s1.toCharArray())
        {
            charCount.put(c, (charCount.getOrDefault(c,0)+1));
        }
        
        int leftW=0;
        int matchTimes=0;
        
        for(int rightW=0; rightW<s2.length();rightW++)
        {
            char right=s2.charAt(rightW);
            
            if(charCount.containsKey(right))
            {
                charCount.put(right, charCount.get(right)-1);
                
                if(charCount.get(right)==0)
                {
                    matchTimes+=1;
                    
                }
            }
            
            if(matchTimes==charCount.size())
            {
                return true;
            }
            
            if(rightW >= s1.length()-1)
            {
                char left=s2.charAt(leftW++);
                
                if(charCount.containsKey(left))
                {
                    if(charCount.get(left)==0)
                    {
                        matchTimes-=1;
                    }
                    
                    charCount.put(left, charCount.get(left)+1);
                }
            }
            
        }
        
        return false;
    }
}

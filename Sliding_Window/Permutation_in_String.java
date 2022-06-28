class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
       Map<Character, Integer> charCount= new HashMap<>(); //hashmap for character count of sub string s1
       
        for(char c: s1.toCharArray())
        {
            charCount.put(c, (charCount.getOrDefault(c,0)+1)); //mapping of sub s1
        }
        
        int leftW=0; //starting window
        int matchTimes=0; //finds out the matches between sub s1 and full string s2
        
        for(int rightW=0; rightW<s2.length();rightW++) //ending window
        {
            char right=s2.charAt(rightW); //window end character
            
            if(charCount.containsKey(right))
            {
                charCount.put(right, charCount.get(right)-1); //if sub contains end window char decrement count
                
                if(charCount.get(right)==0) //if count==0 then increment matched
                {
                    matchTimes+=1;
                    
                }
            }
            
            if(matchTimes==charCount.size()) //as matchTimes is equal to length of sub we have found the permutation
            {
                return true;
            }
            
            if(rightW >= s1.length()-1) //limit end window to length of sub s1
            {
                char left=s2.charAt(leftW++); //starting window character
                
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

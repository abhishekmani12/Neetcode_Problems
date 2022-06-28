class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character, Integer> charcount=new HashMap(); //hashmap for tracking count
        
        int res=0; //length
        
        //Sliding window:
        
        int leftP=0; //starting window
        
        for(int rightP=0;rightP< s.length(); rightP++) //ending window
        {
            char rightC=s.charAt(rightP); //End window character
            
            charcount.put(rightC,(charcount.getOrDefault(rightC,0)+1)); //As window end keeps moving forward, it updates the count or it adds a new character based on the end character
            
            int windowLength=rightP-leftP+1; //Calculating current window length
            
            while((windowLength)-Collections.max(charcount.values())>k) // length-(max number of occurences of a char) > limit k (this will give us the number of replacement required for the current window)
                  {
                      char leftC=s.charAt(leftP); //getting starting window character
                      
                      charcount.put(rightC, charcount.get(rightC)-1); //Decreasing the count to satisfy no. of replacements <= k
                      rightP+=1; //moving starting window to next position
                  }
                  
                  res=Math.max(res, rightP-leftP+1); //max of current res or current window length
        }
            return res;
        
    }
}

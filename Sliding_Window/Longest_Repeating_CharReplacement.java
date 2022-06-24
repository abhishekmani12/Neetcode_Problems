class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character, Integer> charcount=new HashMap();
        
        int res=0;
        int leftP=0;
        for(int rightP=0;rightP< s.length(); rightP++)
        {
            char rightC=s.charAt(rightP);
            
            charcount.put(rightC,(charcount.getOrDefault(rightC,0)+1));
            
            int windowLength=rightP-leftP+1;
            
            while((windowLength)-Collections.max(charcount.values())>k)
                  {
                      char leftC=s.charAt(leftP);
                      
                      charcount.put(rightC, charcount.get(rightC)-1);
                      rightP+=1;
                  }
                  
                  res=Math.max(res, rightP-leftP+1);
        }
            return res;
        
    }
}

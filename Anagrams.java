//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//basic solution:

class Solution {
    public boolean isAnagram(String s, String t) {
        
  char[] sCH=s.toCharArray();
  char[] tCH=t.toCharArray();
        
  Arrays.sort(sCH);
  Arrays.sort(tCH);
  
  boolean res = Arrays.equals(sCH,tCH);
        
  return res;      
        
}

}

//ignore cases, consider only alphanumeric characters (A-Z,0-9)

class Solution {
    public boolean isPalindrome(String s) {
     
        StringBuilder intermediate=new StringBuilder(); //mutable string
        
        //filtering the characters
        
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i))) //allows letters and numbers
                
            {
                intermediate.append(s.charAt(i));   //adding the characters
            }
                
        }
        intermediate=new  StringBuilder(intermediate.toString().toLowerCase());  //converting the characters to lowercase and to string
        
        String filteredStr=intermediate.toString();                              //assigning the filtered lower case string 
        
        return filteredStr.equals(intermediate.reverse().toString());            // comparing the filtered string with the reversed filtered string                                                                                                                                        //to see if they equal
           
    }
}

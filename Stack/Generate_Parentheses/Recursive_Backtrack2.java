class Solution {
    public List<String> generateParenthesis(int n)
    {
        List<String> res = new ArrayList();
        
        backtrack(res, new StringBuilder(), 0, 0, n);
        
        return res;
    }

    
    public void backtrack(List<String> res, StringBuilder temp, int open, int close, int n)
    {
        //Ending-condition 1:
        
        if (temp.length()==n * 2)
        {
            res.add(temp.toString());
            
            return;
        }

        //Condition 2:
        
        if (open<n) 
        {
            temp.append("("); //Open
            
            backtrack(res, temp, open+1, close, n);
            
            temp.deleteCharAt(temp.length() - 1); //popping
        }
        
        //Condition 3:
        
        if (close < open) 
        
        {
            temp.append(")"); //Close
            
            backtrack(res, temp, open, close+1, n);
            
            temp.deleteCharAt(temp.length() - 1); //Popping
        }
    }
}

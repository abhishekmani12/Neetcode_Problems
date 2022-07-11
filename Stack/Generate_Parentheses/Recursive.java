class Solution {
    
    
    public List<String> generateParenthesis(int n) {
        
        backtrack(0,0,n);
        return res;
        
    }
    
    Stack<Character>stack=new Stack<>();
    
    List<String> res=new ArrayList<>();
    
    public static void main(String args[])
    {
        
        Solution sol=new Solution();
        sol.generateParenthesis(3);
    }
    
    private void backtrack(int openN, int closeN, int n)
    {
        
        //Ending-condition 1:
        
        if(closeN==openN && closeN==n)
        {
            Iterator iter=stack.iterator();
            
            String filler="";
            
            while(iter.hasNext())
            {
              filler=filler+iter.next();  
            }
            
            res.add(filler);
            
        }
        
        //condition 2:
        
        if(openN<n)
        {
            stack.push('(');
            backtrack(openN+1,closeN,n);
            stack.pop();
        }
        
        //condition 3:
        
        if(closeN<openN)
        {
            stack.push(')');
            backtrack(openN,closeN+1,n);
            stack.pop();
        }
    }
}

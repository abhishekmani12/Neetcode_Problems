class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack(); //to keep track of the oen closed brackets
        
        Map<Character, Character> checkOpen = new HashMap<>(); //Contains the 3 pairs of brackets for mapping
        
        checkOpen.put(')','(');  //Adding the pairs
        
        checkOpen.put(']','[');
        
        checkOpen.put('}','{');
        
        for(char c: s.toCharArray()) //iterating through the string
        {
            if(checkOpen.containsKey(c)) //checking for the closed brackets in the hmap
            {
                if(!stack.isEmpty() && stack.peek()==checkOpen.get(c)) //stack!= empty and checking if the first element in the stack is equal to the value pair of the closed bracket -- checking if the open bracket is present
                {
                    stack.pop(); //removing the open bracket from the stack
                }
                
                else return false;
            }
            else
            {
                stack.push(c); //populate the stack
            }
        }
        
        return stack.isEmpty(); //handling edge case as well
        
        
    }
}

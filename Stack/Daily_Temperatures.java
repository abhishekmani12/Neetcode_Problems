class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] output= new int[temperatures.length];  //resultant array
        
        Stack<Integer> stack=new Stack<>(); //stack to keep track of the index of temps for calculating the wait days while popping indexes whose value are greater than the previous ones -- monotonic descending stack
        
        for(int current=0;current<temperatures.length;current++)
        {
            
            while (!stack.isEmpty() && temperatures[current]>temperatures[stack.peek()]) //if current temp is greater than the the value of index in stack
            {
                int previous=stack.pop();  //storing popped value ad previous day temp
                
                output[previous]=current-previous; //calculating wait days and storing it in the index of previous day in output arr
            }
            
            stack.add(current); //adding the indices to the stack by default unless it is greater than the previous value 
        }
        
        return output;
        
    }
}

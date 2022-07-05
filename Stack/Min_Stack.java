class MinStack {
    
    private Stack<Integer> stack;  //Actual stack where the operations are performed
    
    private Stack<Integer> MinStack;  //stack which keeps track of the min element for each level of element in the original stack
    
    

    public MinStack() {
        
        stack= new Stack<>();
        
        MinStack=new Stack<>();
        
    }
    
    public void push(int val) {
        
        stack.push(val);
        
        if(MinStack.isEmpty() || val <=MinStack.peek())  //if minstack is empty or value is less than minstack's top element then push is performed on it
        {
            MinStack.push(val);
        }
        
        
    }
    
    public void pop() {
        
        
        if(stack.peek().equals(MinStack.peek())) //Checking ito see if minstack's top element matches with stack's top element in order to pop minstack
        {
            MinStack.pop();
        }
        
        stack.pop();
               
    }
    
    //regular peek
    
    public int top() {
        
        return stack.peek();
        
    }
    
    public int getMin() { //return minstack's top element
        
        return MinStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

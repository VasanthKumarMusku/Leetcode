class MinStack {
    Stack<Integer>st=new Stack<>();
    Stack<Integer>minst=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val<=minst.peek()) minst.push(val);
       
    }
    
    public void pop() {
        if(st.pop().equals(minst.peek())) 
        {
            
            minst.pop();
        }
        // else st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        if(minst.isEmpty()) return 0;
        return minst.peek();
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
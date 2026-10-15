class MinStack {
    Stack<Integer>S;
    Stack<Integer>ms;


    public MinStack() {
        S=new Stack<>();
        ms=new Stack<>();
        
    }
    
    public void push(int value) {
        S.push(value);
        if(ms.isEmpty()){
            ms.push(value);
        }
            else{
                ms.push(Math.min(value,ms.peek()));
            
            }


        
    }
    
    public void pop() {
         S.pop();
        ms.pop();

        
    }
    
    public int top() {
        return S.peek();

        
    }
    
    public int getMin() {
        return ms.peek();

        
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
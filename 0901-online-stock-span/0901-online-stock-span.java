class StockSpanner {
    Stack<int[]>S;
    public StockSpanner() {
        S= new Stack<>();
        
    }
    
    public int next(int price) {
        int span=1;
        while(!S.isEmpty()&&price>=S.peek()[0])
        span=span+S.pop()[1];
        S.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
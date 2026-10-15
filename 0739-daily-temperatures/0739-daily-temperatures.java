class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer>S=new Stack<>();
    int[] answer=new int[temperatures.length];
    for(int i=temperatures.length-1;i>=0;i--)
    {
        while(!S.isEmpty()&&temperatures[S.peek()]<=temperatures[i])
        S.pop();
        if(S.isEmpty())
        answer[i]=0;
        else
        answer[i]=S.peek()-i;
        S.push(i);
    } 
    return answer;  
    }
     
}
class RecentCounter {
    private int[] queue;
    private int front;
    private int rear;

    public RecentCounter() {
        queue = new int[10001];
        front = 0;
        rear = 0;
    }

    public int ping(int t) {
        queue[rear++] = t;

        while (queue[front] < t - 3000) {
            front++;
        }

        return rear - front;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
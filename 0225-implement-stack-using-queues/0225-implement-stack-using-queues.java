class MyStack {
    private Queue<Integer> Queue1;
    private Queue<Integer> Queue2;
    private int top;

    public MyStack() {
        Queue1 = new LinkedList<>();
        Queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        Queue1.offer(x);
        top = x;
    }
    
    public int pop() {
        while (Queue1.size() > 1){
            top = Queue1.poll();
            Queue2.offer(top);
        }
        int popped = Queue1.poll();
        Queue<Integer> temp = Queue1;
        Queue1 = Queue2;
        Queue2 = temp;
        return popped;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return Queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
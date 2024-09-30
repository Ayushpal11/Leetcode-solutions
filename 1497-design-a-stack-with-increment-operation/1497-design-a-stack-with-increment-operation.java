class CustomStack {

    private List<Integer> stack;
    private int maxSize;

    public CustomStack(int maxSize) {
        stack = new LinkedList<>();
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if (stack.size() < maxSize){
            stack.addLast(x);
        }
    }
    
    public int pop() {
        if (stack.isEmpty()) return -1;
        return stack.removeLast();
    }
    
    public void increment(int k, int val) {
        ListIterator<Integer> iterator = stack.listIterator();
        while (iterator.hasNext() && k > 0){
            int curr = iterator.next();
            iterator.set(curr + val);
            k--;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
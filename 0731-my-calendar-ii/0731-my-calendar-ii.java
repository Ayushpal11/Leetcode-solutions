class MyCalendarTwo {
    List<int[]> book;
    TreeMap<Integer, Integer> cal;
    public MyCalendarTwo() {
        book = new ArrayList<>();
        cal = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer prev = cal.lowerKey(end);
        if ((prev != null  && start <= cal.get(prev)-1)){
            return false;
        }
        for (int boo[]: book){
            int commStart = Math.max(boo[0],start);
            int commEnd = Math.min(boo[1],end);
            if (commStart<commEnd){
                cal.put(commStart, commEnd);
            }
        }
        book.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // if (sentence1.length() > sentence2.length()){
        //     return true;
        // }
        // for (int i=0; i<sentence1.length(); i++){
        //     if (sentence1.charAt(i) == sentence2.charAt(i)){
        //         return true;
        //     }
        // }
        // return false;
        Deque<String> deq1 = new ArrayDeque<>(Arrays.asList(sentence1.split(" ")));
        Deque<String> deq2 = new ArrayDeque<>(Arrays.asList(sentence2.split(" ")));
        while (
            !deq1.isEmpty() &&
            !deq2.isEmpty() &&
            deq1.peek().equals(deq2.peek())
        ){
            deq1.poll();
            deq2.poll();
        }
        while (
            !deq1.isEmpty() && 
            !deq2.isEmpty() &&
            deq1.peekLast().equals(deq2.peekLast())
        ){
            deq1.pollLast();
            deq2.pollLast();
        }
        if (deq1.isEmpty() || deq2.isEmpty()){
            return true;
        }
        return false;

    }
}
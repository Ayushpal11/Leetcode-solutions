/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)->Integer.compare(a,b)
        );

        for (ListNode node :lists){
            while (node != null){
                pq.add(node.val);
                node = node.next;
            }
        }if (pq.isEmpty()) return null;
        int temp = pq.remove();
        ListNode head = new ListNode(temp);
        ListNode temp1 = head;
        while (!pq.isEmpty()){
            int re = pq.remove();
            temp1.next = new ListNode(re);
            temp1 = temp1.next;
        }
        return head;

    }
}
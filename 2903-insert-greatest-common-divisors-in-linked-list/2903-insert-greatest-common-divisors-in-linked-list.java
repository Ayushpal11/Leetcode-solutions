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
    private int GCD(int a, int b){
        if (b == 0){
            return a;
        }else {
            return GCD(b,a %b);
        }
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        while (second != null){
            int gcdval = GCD(first.val, second.val);
            ListNode gcdNode = new ListNode(gcdval);
            first.next = gcdNode;
            gcdNode.next = second;
            first = second ;
            second = second.next;
        }
        return head;
    }
}
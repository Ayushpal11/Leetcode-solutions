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
    public ListNode swapPairs(ListNode head) {
        while (head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        ListNode fast = temp.next;

        head.next = fast;
        temp.next = head;
        head = temp;
        temp = temp.next;
        temp.next = swapPairs(fast);

        return head;
    }
}
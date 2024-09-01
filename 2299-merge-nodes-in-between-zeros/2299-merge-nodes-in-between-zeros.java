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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        if (head == null){
            return head;
        }
        ListNode temp = head;
        int add = 0;
        while (temp.val!=0){
            add += temp.val;
            temp = temp.next;
        }

        head.val = add;
        head.next = mergeNodes(temp);
        return head;
    }
}
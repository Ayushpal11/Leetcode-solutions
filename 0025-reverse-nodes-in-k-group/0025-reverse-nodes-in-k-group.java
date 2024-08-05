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
    public ListNode reverseKGroup(ListNode head, int k) {
        while (head == null ){
            return null;
        }
        ListNode temp = null;
        ListNode res = null;
        ListNode slow = head;
        int cnt = 0;
        while (slow != null && cnt < k){
            slow = slow.next;
            cnt ++;
        }
        slow = head;
        if (cnt == k){
            cnt = 0;
            while (slow != null && cnt < k){
                temp = slow.next;
                slow.next = res;
                res = slow;
                slow = temp;
                cnt++;
            }
        }else{
            res = head;
        }

        if (temp != null){
            head.next = reverseKGroup(temp,k);
        }
        return res;
    }
}
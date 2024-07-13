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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        Collections.sort(arr);
        ListNode temp = new ListNode(0);
        ListNode slow = temp;

        for(int x : arr){
            slow.next = new ListNode(x);
            slow = slow.next;
        }
        return temp.next;
    }
}
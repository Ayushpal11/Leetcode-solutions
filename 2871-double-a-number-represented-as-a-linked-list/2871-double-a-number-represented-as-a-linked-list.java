/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head.val  > 4){
            head = new ListNode(0,head);
        }
        for (ListNode node = head; node != null; node = node.next){
            node.val = (node.val * 2) % 10;
            if(node.next != null && node.next.val > 4){
                node.val++;
            }
        }
        return head;
    //     ListNode revList = reverseList(head);
    //     int cry = 0;
    //     ListNode curr = revList, prev = null;

    //     while (curr != null){
    //         int newVal = curr.val * 2 + cry;
    //         curr.val = newVal % 10;

    //         if (newVal > 9){
    //             cry = 1;
    //         }else {
    //             cry = 0;
    //         }
    //         prev = curr;
    //         curr = curr.next;
    //     }
    //     if (cry != 0){
    //         ListNode extra  = new ListNode(cry);
    //         prev.next = extra;
    //     }

    //     ListNode result = reverseList(revList);
    //     return result;
    // }
    // public ListNode reverseList(ListNode node) {
    //     ListNode prev = null, curr = node, nextNode;
    //     while (curr != null) {
    //         nextNode = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = nextNode;
    //     }

    //     return prev;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // public int deletefirst(){
    //     int val = head.value;
    //     head = head.next;
    //     if(head == null){
    //         tail = null;
    //     }
    //     size--;
    //     return val;
    // }
    // public int deletelast(int size){
    //     if(size <=1 ){
    //         return deletefirst();
    //     }
    //     Node secondLast = get(size-2);
    //     int val = tail.value;
    //     tail = secondLast;
    //     tail.next = null;
    //     return val;
    // }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next=node.next.next;
    }
}

//O(1)
//O(1)
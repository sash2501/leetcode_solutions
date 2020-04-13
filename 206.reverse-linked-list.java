/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null, current=head, nextptr=null;
        while(current!=null){
            nextptr=current.next;
            current.next=prev;
            prev=current;
            current=nextptr;
        }
        head = prev;
        return head;
        
    }
}

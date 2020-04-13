/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head; //empty list
        } 
        
        ListNode empty = new ListNode(-1); //dummy node for prev to head
        empty.next = head;
        
        ListNode current = head;
        ListNode prev = empty;
        
        while(current != null){
            if(current.val == val){
                prev.next = current.next;
                current = prev.next;
            }
            else{
                prev = prev.next;
                current = current.next;
            }
        }
        return empty.next;
    
}
}

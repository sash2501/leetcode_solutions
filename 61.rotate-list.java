/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int length=0;
        for(ListNode i=head; i!=null;i=i.next){
            length++;
        }
        if(length == 0){
            return head; //empty list
        }
        k= k%length;
        if(k == 0){
            return head;//no need to rotate
        }
        ListNode slow=head;
        ListNode fast=head;
        while(k>0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        fast.next=head;
        ListNode headnew= slow.next;
        slow.next=null;
        return headnew;
        
    }
}

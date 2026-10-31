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
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy , slow =dummy ;
        while(fast.next!= null && fast.next.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode forward = null , prev = null;
        while(curr != null)
        {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        ListNode temp = head;
        while(temp != null)
        {
            if(temp.val != prev.val)
            {
                return false;
            }
            temp = temp.next;
            prev = prev.next;

        }
        return true;
        
    }
}
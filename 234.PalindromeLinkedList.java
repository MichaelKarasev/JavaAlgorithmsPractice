/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while ((fast != null) && (fast.next != null)){
            fast = fast.next.next;
            slow = slow.next;
        }
        Solution foo = new Solution();
        ListNode rev = foo.reverse(slow);
        while ((rev != null) & (head != null)){
            if (rev.val != head.val){
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
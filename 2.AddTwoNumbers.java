/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode x = l1;
        ListNode y = l2;
        ListNode curr = new ListNode(0);
        ListNode head = curr;
        int over = 0;
        while((x != null) || (y != null)){
            int value = 0;
            value += (x != null) ? x.val : 0;
            value += (y != null) ? y.val : 0;
            value += over;
            over = value / 10;
            curr.next = new ListNode(value % 10);
            curr = curr.next;
            x = (x != null) ? x.next : x;
            y = (y != null) ? y.next : y;
        }
        if (over > 0){
            curr.next = new ListNode(1);
        }
        return head.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        while ((l1 != null) || (l2 != null)){
            System.out.println("1");
            if (l1 == null){
                res.next = l2;
                res = res.next;
                l2 = l2.next;
                continue;
                //System.out.println("2");
            }
            if (l2 == null){
                res.next = l1;
                res = res.next;
                l1 = l1.next;
                continue;
                //System.out.println("3");
            }
            if (l1.val <= l2.val){
                res.next = l1;
                res = res.next;
                l1 = l1.next;
                continue;
                //System.out.println("4");
            }
            if (l2.val < l1.val){
                res.next = l2;
                res = res.next;
                l2 = l2.next;
                continue;
                //System.out.println("5");
            }
        }
        return head.next;
    }
}
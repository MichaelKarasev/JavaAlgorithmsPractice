/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if ((headA == null) || (headB == null)){
            return null;
        }
        int lenA = 1; int lenB = 1;
        ListNode startA = headA;
        ListNode startB = headB;
        while((startA.next != null) || (startB.next != null)){
            if ((startA.next != null) & (startB.next != null)){
                startA = startA.next;
                startB = startB.next;
                lenA++; lenB++;
            }
            else if ((startA.next == null) & (startB.next != null)){
                startB = startB.next;
                lenB++;
            }
            else{
                startA = startA.next;
                lenA++;
            }
        }
        if (lenA > lenB){
            for (int i = 0; i < (lenA - lenB); i++){
                headA = headA.next;
            }
        }
        if (lenA < lenB){
            for (int i = 0; i < (lenB - lenA); i++){
                headB = headB.next;
            }
        }
        lenA = Math.min(lenA, lenB);
        for (int i = 0; i < lenA; i++){
            if (headA.val == headB.val){
                return headA;
            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
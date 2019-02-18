/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head.next;
        ListNode faster = head.next.next;

        while (slow != faster) {
            if (slow == null) {
                return false;
            }
            if (faster == null || faster.next == null) {
                return false;
            }
            slow = slow.next;
            faster = faster.next.next;
        }

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }      
        return head;
    }
}
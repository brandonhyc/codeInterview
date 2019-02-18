/**
 * Definition for ListNode
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
    /*
     * @param node: a list node in the list
     * @param x: An integer
     * @return: the inserted new list node
     */
    public ListNode insert(ListNode node, int x) {
        // write your code here

        if (node == null) {
            node = new ListNode(x);
            node.next = node;
            return node;
        }

        ListNode head = node;
        ListNode prev = null;

        while (prev != head) {
            // head != prev && !(prev.val <= x && x <= head.val)
            // System.out.printf("prev.val: %d, head.val: %d", prev.val, head.val);
            prev = head;
            head = head.next;
            if (prev.val <= x && x <= head.val) {
                break;
            }
            // if ((prev.val > head.val) && (x < head.val || x > prev.val)) {
            //     break;
            // }

        }

        prev.next = new ListNode(x);
        prev.next.next = head;
        return prev.next;
    }
}
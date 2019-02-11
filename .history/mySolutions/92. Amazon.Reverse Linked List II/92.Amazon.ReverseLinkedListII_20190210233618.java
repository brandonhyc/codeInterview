class Solution {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        // m = left, n = right
        if (m >= n || head == null) {
            return head;
        }

        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        ListNode con = prev, tail = cur;
        ListNode third = null;

        // reverse
        while (n > 0) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            n--;
        }

    }
}
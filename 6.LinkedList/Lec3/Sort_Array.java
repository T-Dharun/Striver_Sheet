public class Solution {
    ListNode merge(ListNode a, ListNode b) {
        ListNode temp = new ListNode(-1);
        ListNode ptr = temp;
        while (a != null && b != null) {
            if (a.val < b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        while (a != null) {
            temp.next = a;
            a = a.next;
            temp = temp.next;
        }
        while (b != null) {
            temp.next = b;
            b = b.next;
            temp = temp.next;
        }
        temp.next = null;
        return ptr.next;
    }

    ListNode mid(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head, slow = head;
        ListNode ptr=slow;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ptr=slow;
            slow = slow.next;
        }
        return ptr;
    }
    ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middle = mid(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}

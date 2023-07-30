package datastructures.linkedlist.single;

//https://leetcode.com/problems/reorder-list/
public class ReorderList {

    public static ListNode reverse(ListNode node) {
        ListNode prev = null, cur = node, next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void reorderList(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverse(slow);

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (slow.next != null) {
            tail.next = head;
            head = head.next;
            tail = tail.next;

            tail.next = slow;
            slow = slow.next;
            tail = tail.next;
        }
        if(head != null) {
            tail.next = head;
        }

        head = dummy;

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        //list1.next.next.next.next = new ListNode(5);

        reorderList(list1);
        System.out.println(list1.val);
    }
}

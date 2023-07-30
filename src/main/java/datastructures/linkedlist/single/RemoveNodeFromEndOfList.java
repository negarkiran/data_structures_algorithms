package datastructures.linkedlist.single;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNodeFromEndOfList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head, start;

        int counter = 0, size, pos, index;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            counter++;
        }

        //Determine size of the list
        if (fast != null) {
            size = 2 * counter + 1;
        } else {
            size = 2 * counter;
        }

        index = size - n;

        //Determine which side to traverse
        if (index <= counter) {
            start = head;
            pos = 0;
        } else {
            start = slow;
            pos = counter;
        }

        //Find the previous node and delete
        while (pos < index - 1) {
            start = start.next;
            pos++;
        }

        ListNode temp = start.next;
        if (index == 0) {
            head = temp;
        } else {
            start.next = temp.next;
        }

        return head;
    }

    public static ListNode removeNthFromEndV1(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy, fast = dummy.next;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        //list.next.next.next.next = new ListNode(5);

        ListNode res = removeNthFromEndV1(list, 3);
        System.out.println(res.val);
    }
}

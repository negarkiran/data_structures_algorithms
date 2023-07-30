package datastructures.linkedlist.single;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head, fast = head;

        while ((fast != null && fast.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        //list1.next = new ListNode(2);
        //list1.next.next = new ListNode(3);
        //list1.next.next.next = new ListNode(4);
        //list1.next.next.next.next = list1.next;

        System.out.println(hasCycle(list1));
    }
}

package datastructures.linkedlist.single;

//https://leetcode.com/problems/merge-two-sorted-lists/description/

public class MergeSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 == null) {
            tail.next = list2;
        } else {
            tail.next = list1;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(-10);
        list1.next = new ListNode(-9);
        list1.next.next = new ListNode(-6);

        ListNode list2 = new ListNode(-5);
        list2.next = new ListNode(-3);
        list2.next.next = new ListNode(0);

        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println(listNode.val);
    }
}

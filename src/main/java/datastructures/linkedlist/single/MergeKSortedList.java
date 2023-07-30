package datastructures.linkedlist.single;

//https://leetcode.com/problems/merge-k-sorted-lists/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeKSortedList {

    public static ListNode mergeKLists(ListNode[] lists) {

        while (lists.length > 1) {
            List<ListNode> mergedList = new ArrayList<>();

            for (int i = 0; i < lists.length; i=i+2) {
                ListNode l1 = lists[i];
                ListNode l2 = i + 1 < lists.length ? lists[i+1] : null;
                ListNode res = mergeTwoLists(l1, l2);
                mergedList.add(res);
            }
            lists = new ListNode[mergedList.size()];
            lists = mergedList.toArray(lists);
        }
        return lists[0];
    }

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

        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(2);
        list3.next.next = new ListNode(3);

        ListNode[] array = {list1, list2, list3};
        ListNode listNode = mergeKLists(array);
        System.out.println(listNode.val);
    }
}

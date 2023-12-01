package com.IVdev.Lists;

import static java.lang.Math.random;

/*
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Интуиция заключается в том, чтобы выполнить итерацию по двум связанным спискам,
представляющим неотрицательные целые числа, в обратном порядке, начиная с наименее значащей цифры.
Он выполняет сложение по цифрам вместе со значением переноса и создает новый связанный список для
представления суммы. Процесс продолжается до тех пор,пока не будут исчерпаны оба списка ввода и значение переноса.
Результирующий связанный список представляет собой сумму входных чисел в правильном порядке.
*/
public class RevertSumOfTwoLists {
    public static void main(String[] args) {
        RevertSumOfTwoLists rst = new RevertSumOfTwoLists();
        ListNode list1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        rst.addTwoNumbers(list1, l2);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}

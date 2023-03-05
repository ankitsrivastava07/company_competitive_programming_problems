package problems;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, carry = 0;

        ListNode sumOfNumber = new ListNode();
        ListNode curr = sumOfNumber;

        while (l1 != null || l2 != null) {
            sum = 0;
            if (l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            curr.next = newNode;
            curr = newNode;
        }

        return sumOfNumber;
    }
}

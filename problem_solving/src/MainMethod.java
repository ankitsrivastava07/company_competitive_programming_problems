import problems.FormatDate;

public class MainMethod {
    public static void main(String[] args) {
        String date = "17th Jul 1997";

       /* ListNode l1 = new ListNode(2);
         ListNode node = new ListNode(4);
         l1.next = node;
         node.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        node = new ListNode(6);
        l2.next = node;

        node.next = new ListNode(4);
        ListNode sum = AddTwoNumbers.addTwoNumbers(l1, l2);

        while (sum!=null){
            System.out.println(sum.val + " ");
            sum = sum.next;
        }*/
        System.out.println(FormatDate.formatDate(date));

    }
}

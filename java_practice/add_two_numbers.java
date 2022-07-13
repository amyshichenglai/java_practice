public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        while (l1 != null && l2 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
    }

    public static void main(String[] args) {
        System.out.println(addTwoNumbers([1,1,1], [2,2,2]));
    }
}

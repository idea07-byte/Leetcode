/**
 * 86. Partition List
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem86_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode beforeDummy = new ListNode(0);
        ListNode before = beforeDummy;
        ListNode afterDummy = new ListNode(0);
        ListNode after = afterDummy;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null;
        before.next = afterDummy.next;
        return beforeDummy.next;
    }
}

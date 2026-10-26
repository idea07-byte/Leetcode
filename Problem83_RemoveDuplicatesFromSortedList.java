/**
 * 83. Remove Duplicates from Sorted List
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Problem83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

/**
 * Created by Daniel on 2/6/2017.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode cur) {
        ListNode next;
        ListNode prev = null;

        if (cur.next == null)
            return cur;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

}

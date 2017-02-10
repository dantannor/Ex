import java.util.ArrayList;

/**
 * Created by Daniel on 2/7/2017.
 */
class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ArrayList toList() {
        ArrayList res = new ArrayList();
        ListNode cur = this;
        res.add(val);

        while ((cur = cur.next) != null) {
            res.add(cur.val);
        }

        return res;
    }
}

package Lists;

import java.util.ArrayList;

/**
 * Created by Daniel on 2/7/2017.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ArrayList toList() {
        ArrayList res = new ArrayList();
        ListNode cur = this;
        res.add(val);

        while ((cur = cur.next) != null) {
            res.add(cur.val);
        }

        return res;
    }
}

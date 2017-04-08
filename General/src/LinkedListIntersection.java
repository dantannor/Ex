import Lists.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.

 For example, the following two linked lists:


 A:          a1 → a2
                        ↘
                        c1 → c2 → c3
                        ↗
 B:     b1 → b2 → b3

 */
public class LinkedListIntersection {

        public ListNode getIntersectionNode(ListNode a, ListNode b) {
            int aLength = getLength(a);
            int bLength = getLength(b);

            while (a != null && b != null){
                if(aLength > bLength){
                    a = a.next;
                    aLength--;
                }else if (bLength > aLength){
                    b = b.next;
                    bLength--;
                }else {
                    if(a == b){
                        return a;
                    }else {
                        a = a.next;
                        b = b.next;

                        aLength--;
                        bLength--;
                    }
                }
            }

            return null;
        }

    private int getLength(ListNode a) {
        int count = 0;
        while(a != null){
            count++;
            a = a.next;
        }

        return count;
    }
}

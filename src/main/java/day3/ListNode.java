package day3;

/**
 * Created by moreti on 1/3/17.
 */
public class ListNode {
    public int item;
    public ListNode next;

    public ListNode() {

    };

    public ListNode(int i, ListNode n) {
        item = i;
        next = n;
    }

    public ListNode(int i) {
        this(i, null);
    }

    public void insertAfter(int item) {
        next = new ListNode(item, next);
    }

    public static void main(String[] args) {
//        ListNode n1 = new ListNode(), n2 = new ListNode(), n3 = new ListNode();
//        n1.item = 7;
//        n2.item = 0;
//        n3.item = 6;
//        n1.next = n2;
//        n2.next = n3;

        ListNode n1 = new ListNode(7, new ListNode(0, new ListNode(6)));

        ListNode node = n1;
        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }

        System.out.println("**************");

        n1.insertAfter(5);
        n1.next.next.insertAfter(10);

        node = n1;
        while (node != null) {
            System.out.println(node.item);
            node = node.next;
        }
    }
}

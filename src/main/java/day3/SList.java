package day3;

/**
 * Created by moreti on 1/3/17.
 */
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    public void insertFront(Object item) {
        head = new SListNode(item, head);
        size++;
    }

    public static void main(String[] args) {
        SList list = new SList();
        list.insertFront("fish");
        list.insertFront("milk");
        list.insertFront("fruit");
        list.insertFront("soap");

        SListNode next = list.head;
        for (int i = 0; i < list.size; i++) {
            System.out.println(next.item);
            next = next.next;
        }
    }
}

package day6;

public class TailList extends SList {
    private SListNode tail;

    public void insertEnd(Object obj) {
        if (head == null) {
            head = new SListNode(obj);
            tail = head;
        } else {
            SListNode node = tail;
            node.next = new SListNode(obj);
        }
        size++;
    }

    public void insertFront(Object obj) {
        head = new SListNode(obj, head);
        if (head.next == null) {
            tail = head;
        }
        size++;
    }

    public static void main(String[] args) {
        SList s = null;
        SList t = new SList();
        System.out.println(t instanceof TailList);

    }
}

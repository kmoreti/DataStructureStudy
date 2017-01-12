package day4;

/**
 * Created by moreti on 1/7/17.
 */
public class DListNode {
    Object item;
    DListNode next;
    DListNode prev;

    public DListNode(Object item, DListNode next, DListNode prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}

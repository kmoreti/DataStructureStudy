package project1;

/**
 * Created by moreti on 1/31/17.
 */
class DListNode {
    Object item;
    DListNode next;
    DListNode prev;

    public DListNode(){
        item = null;
        next = null;
        prev = null;
    }

    public DListNode(Object item, DListNode next, DListNode prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}

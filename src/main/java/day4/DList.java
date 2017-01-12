package day4;

/**
 * Created by moreti on 1/7/17.
 */
public class DList {
    private DListNode sentinel;
    private long size;

    public long size() {
        return size;
    }

    public void removeBack() {
        if (sentinel.prev != sentinel) {
            sentinel.prev = sentinel.prev.prev;
            sentinel.prev.next = sentinel;
            size--;
        }
    }

    public void removeFront() {
        if (sentinel.next != sentinel) {
            sentinel.next = sentinel.next.next;
            sentinel.next.prev = sentinel;
            size--;
        }
    }
}

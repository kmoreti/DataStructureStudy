package project1;

import java.util.Iterator;

/**
 * Created by moreti on 1/31/17.
 */
public class DList {
    private DListNode head;
    private int size;

    public DList() {
        head = new DListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public DList(Object o) {
        head = new DListNode();
        head.item = o;
        head.prev = head.next;
        head.next.prev = head;
        head.prev.next = head;
        size = 1;
    }

    public void removeBack() {
        if (head.prev != head) {         // Do nothing if the DList is empty.
            head.prev = head.prev.prev;   // Sentinel now points to second-last item.
            head.prev.next = head;        // Second-last item now points to sentinel.
            size--;
        }
    }

    public void removeFront() {
        if (head.next != head) {
            head.next = head.next.next;
            head.next.prev = head;
            size--;
        }
    }

    public void insertFront(Object o) {
        if (head.next != head) {
            head.next.prev = new DListNode(o, head.next, head);
            head.next = head.next.prev;
        } else {
            head.next = new DListNode(o, head, head);
            head.prev = head.next;
        }
        size++;
    }

    protected DListNode getHead(){
        return head;
    }

    public void insertAt(int pos, Object o) {
        DListNode addNode = new DListNode();
        addNode.item = o;
        DListNode node = getNode(pos);
        addNode.prev = node;
        addNode.next = node.next;
        node.next.prev = addNode;
        node.next = addNode;
        size++;
    }

    public void removeAt(int pos) {
        if (pos > 0) {
            DListNode node = getNode(pos);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }
    }

    public void updateAt(int pos, Object o) {
        DListNode node = getNode(pos);
        node.item = o;
    }

    private DListNode getNode(int pos){
        DListNode node = head.prev;
        if (node != head) {
            for (int i = 1; i < pos; i++) {
                node = node.prev;
                if (node == head) {
                    return null;
                }
            }
        }
        return node;
    }

    public int getSize() {
        return size;
    }

    protected Object getValue(int pos){
        DListNode node = getNode(pos);
        return node != null ? node.item : null;
    }
}

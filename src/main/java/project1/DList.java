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

    public void insertBack(Object o) {
        if (head.prev != head) {
            head.prev.next = new DListNode(o, head, head.prev);
            head.prev = head.prev.next;
        } else {
            head.prev = new DListNode(o, head, head);
        }
    }

    public void insertFront(Object o) {
        if (head.next != head) {
            head.next.prev = new DListNode(o, head.next, head);
            head.next = head.next.prev;
        } else {
            head.next = new DListNode(o, head, head);
        }
    }

    private DListNode getHead(){
        return head;
    }

    public void insertAt(int pos, Object o) {
        DListNode addNode = new DListNode();
        addNode.item = o;
        DListNode node = getNode(pos);
        node.next.prev = addNode;
        node.prev.next = addNode;
        addNode.prev = node;
    }

    public void updateAt(int pos, Object o) {
        DListNode node = getNode(pos);
        node.item = o;
    }

    private DListNode getNode(int pos){
        DListNode node = head.next;
        if (node != head) {
            for (int i = 1; i < pos && node.next != head; i++) {
                node = node.next;
            }
        }
        return node;
    }

    protected Object getValue(int pos){
        DListNode node = getNode(pos);
        return node.item;
    }
}

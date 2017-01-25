package day7;

import day3.SListNode;

/**
 * Created by moreti on 1/24/17.
 */
public class SList extends List {
    protected SListNode head;

    @Override
    public void insertFront(Object item) {
        head = new SListNode(item, head);
        size++;
    }
}

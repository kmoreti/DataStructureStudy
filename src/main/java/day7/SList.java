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

    public static void main(String[] args) {
        List myList = new SList();
        myList.insertFront(1);
        //myList.head; //Compile-time error (Not every List has a "head" field.)
        SList x = (SList) myList;
        x.head = new SListNode(1,x.head);
    }
}

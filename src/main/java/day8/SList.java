package day8;

import day3.SListNode;


/**
 * Created by moreti on 1/24/17.
 */
public class SList extends List implements Nukeable, Comparable{
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

    @Override
    public void nuke() {
        head = null;
        size = 0;
        int w = Nukeable.x;
    }

    @Override
    public int compareTo(Object o) {

        /**
         * Returns a number < 0 if this < 0,
         *                    0 if this.equals(o),
         *                  > 0 if this > 0
         */
        return 0;
    }
}

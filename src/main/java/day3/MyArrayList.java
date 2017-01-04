package day3;

/**
 * Created by moreti on 1/3/17.
 */
public class MyArrayList {

    int a[];
    int lastItem;

    public MyArrayList() {
        a = new int[10];
        lastItem = -1;
    }

    public void insertItem(int newItem) {

        ensureCapacity();

        a[lastItem + 1] = newItem;
        lastItem++;
    }

    public void insertItem(int newItem, int location) {
        int i;

        ensureCapacity();

        for (i = lastItem; i >= location; i--) {
            a[i+1] = a[i];
        }

        a[location] = newItem;
        lastItem++;
    }

    public void ensureCapacity() {
        int i;
        if (lastItem + 1 == a.length) {
            int [] b = new int[2 * a.length];
            for (i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.insertItem(1);
        myArrayList.insertItem(2);
        myArrayList.insertItem(3);
        myArrayList.insertItem(4);
        myArrayList.insertItem(5);
        myArrayList.insertItem(6);
        myArrayList.insertItem(7);
        myArrayList.insertItem(8);
        myArrayList.insertItem(9);
        myArrayList.insertItem(10);

        System.out.println("Array length: " + myArrayList.a.length);

        for (int i = 0; i < 10; i++) {
            System.out.println(myArrayList.a[i]);
        }

        myArrayList.insertItem(11,5);
        myArrayList.insertItem(12,1);
        myArrayList.insertItem(13,1);
        myArrayList.insertItem(14,0);
        myArrayList.insertItem(15,3);
        myArrayList.insertItem(16,8);
        myArrayList.insertItem(17);
        myArrayList.insertItem(18,6);


        System.out.println("Array length: " + myArrayList.a.length);

        for (int i = 0; i < myArrayList.a.length; i++) {
            System.out.println(myArrayList.a[i]);
        }

    }

}


package day7;

/**
 * Created by moreti on 1/24/17.
 */
public abstract class List {
    protected int size;

    public int length() {
        return  size;
    }

    public List() {
        size = 0;
    }

    public abstract void insertFront(Object item);
}

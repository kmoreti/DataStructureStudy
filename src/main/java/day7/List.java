package day7;

/**
 * Created by moreti on 1/24/17.
 */
public abstract class List {
    protected int size;

    public int length() {
        return  size;
    }

    public abstract void insertFront(Object item);
}

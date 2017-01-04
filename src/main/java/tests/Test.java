package tests;

/**
 * Created by moreti on 12/28/16.
 */
public class Test {
    public static void main(String[] args) {

        double x = 11.2 % 4.9;

        System.out.println(x);

        int y = Integer.parseInt("1678");
        System.out.println(y);

        int i = 43;
        long l = 43L;

        l = i;
        System.out.println(l);
        i = (int)l;
        System.out.println(i);
    }
}

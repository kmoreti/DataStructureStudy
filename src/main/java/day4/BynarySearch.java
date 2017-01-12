package day4;

import java.io.BufferedReader;

/**
 * Created by moreti on 1/11/17.
 */
public class BynarySearch {

    public static final int FAILURE = -1;

    private static int bsearch(int [] i, int left, int right, int findMe) {
        System.out.println(System.currentTimeMillis());
        if (left > right) {
            return FAILURE;
        }

        int mid = (left + right) / 2;
        if (findMe == i[mid]){
            return mid;
        }else if (findMe < i[mid]) {
            return bsearch(i, left, mid - 1, findMe);
        } else {
            return bsearch(i, mid + 1, right, findMe);
        }


    }

    public static int bsearch(int [] i, int findMe) {
        return bsearch(i,0,i.length - 1, findMe);
    }

    public static void main(String[] args) {
        int [] x = new int [10000000];
        for (int i = 0; i < 10000000; i ++) {
            x[i] = i*2;
        }
        System.out.println("Result: "+ BynarySearch.bsearch(x,1000000));
    }
}

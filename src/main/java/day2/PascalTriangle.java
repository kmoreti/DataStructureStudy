package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by moreti on 1/3/17.
 */
public class PascalTriangle {
    public static void printTriangle(int number) {
        long [][] pt = new long [number][];
        for (int i = 0; i < number; i++) {
            pt[i] = new long [i+1];
            pt[i][0] = 1;
            for (int j = 1; j < i; j++) {
                pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
            }
            pt[i][i] = 1;
        }
        for (int i = 0; i < number; i++) {
            System.out.print("Line [" + (i+1) + "] " );
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + pt[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException {
        int number = 0;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(keyboard.readLine());
        printTriangle(number);
    }
}

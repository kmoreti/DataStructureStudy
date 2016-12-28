package day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by moreti on 12/27/16.
 */
public class Hw1ReadFromUrl {
    public static void main(String[] args) throws Exception{
        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter the name of a company (without spaces): ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();

        URL url = new URL("http://www." + inputLine + ".com.br");

        BufferedReader site = new BufferedReader(
                new InputStreamReader(url.openStream())
        );
        String first = site.readLine();
        String second = site.readLine();
        String third = site.readLine();
        String fourth = site.readLine();
        String fifth = site.readLine();

        System.out.println(fifth);
        System.out.println(fourth);
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}

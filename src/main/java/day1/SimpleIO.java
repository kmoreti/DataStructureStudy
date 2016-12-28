package day1;

import java.io.*;
import java.net.URL;

/**
 * Created by moreti on 12/26/16.
 */
public class SimpleIO {
    //System.out is a PrintStream object that outputs to the screen
    //System.in is an InputStream object that reads from the keyboard
    //readLine method is defined on BufferReader objects

    //* How do we construct a BufferedReader? (Chars into entire lines of text)
    //- Whith an InputStreamReader
    //* How do we construct a InputStreamReader? (Compose into characters, typically 2 bytes)
    //- We need an InputStream
    //* How do we construct a InputStream? (Reads raw data)
    //- System.in is one

    public static void main(String[] args) throws Exception{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(keyboard.readLine());

        URL url = new URL("http://www.uol.com.br");
        BufferedReader site = new BufferedReader(new InputStreamReader(url.openStream()));
        String text = null;
        while ((text = site.readLine()) != null) {
            System.out.println(text);
        }
    }
}

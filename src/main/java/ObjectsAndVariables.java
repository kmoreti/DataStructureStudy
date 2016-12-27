import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by moreti on 12/26/16.
 */
public class ObjectsAndVariables {
    public static void main(String[] args) {
        String s1;
        s1 = new String();

        String s2 = new String();

        s1 = "Yow!";
        s2 = s1; //s1 & s2 reference same object.

        s2 = new String(s1);//s1 & s2 reference 2 different identical objects;

        s2 = s1.toUpperCase();
        System.out.println(s2);

        String s3 = s2.concat("!!");
        System.out.println(s3);

        String s4 = "*".concat(s2).concat("*");
        System.out.println(s4);

        s4 = "&" + s2 + "&";
        System.out.println(s4);

        //Strings are immutable: their contents never change
    }
}

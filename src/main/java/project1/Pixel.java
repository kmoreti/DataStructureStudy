package project1;

import java.awt.*;

/**
 * Created by moreti on 1/27/17.
 */
class Pixel {
    private short red;
    private short green;
    private short blue;

    short getRed() {
        return red;
    }

    void setRed(short red) {
        this.red = red;
    }

    short getGreen() {
        return green;
    }

    void setGreen(short green) {
        this.green = green;
    }

    short getBlue() {
        return blue;
    }

    void setBlue(short blue) {
        this.blue = blue;
    }

    void setRGB(short red, short green, short blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }
}

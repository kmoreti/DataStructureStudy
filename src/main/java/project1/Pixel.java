package project1;

import java.awt.*;

/**
 * Created by moreti on 1/27/17.
 */
class Pixel {
    private short red;
    private short green;
    private short blue;

    public Pixel() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    public Pixel(short red, short green, short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

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

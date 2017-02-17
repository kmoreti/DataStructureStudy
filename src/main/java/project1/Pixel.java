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

    public Pixel(Pixel pix) {
        this(pix.getRed(), pix.getGreen(),pix.getBlue());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pixel pixel = (Pixel) o;

        if (red != pixel.red) return false;
        if (green != pixel.green) return false;
        return blue == pixel.blue;
    }

    @Override
    public int hashCode() {
        int result = (int) red;
        result = 31 * result + (int) green;
        result = 31 * result + (int) blue;
        return result;
    }
}

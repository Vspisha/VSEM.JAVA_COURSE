package chu.edu.module2.inheritance;

import java.util.Objects;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Rectangle
 * @since 17.03.2021 - 19.31
 **/
public class Rectangle {
    private int length;
    private int width;


    // CONSTRUCTORS
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // GETTERS AND SETTERS

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // getArea metod

    public int getAreaRectangle(){
    return this.getLength() * this.getWidth()  ;
    }


    // toString , hashCode , equals

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }
    public int getArea(){
        return this.getWidth() * this.getLength();
    }
}

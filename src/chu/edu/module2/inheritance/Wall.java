package chu.edu.module2.inheritance;

import java.util.Objects;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Wall
 * @since 19.03.2021 - 18.08
 **/
public class Wall extends Rectangle  {

    private String color;
    private String material;
    private boolean isInner;
    private boolean isWarmed;

    // CONSTRUCTORS

    public Wall() {
    }

    public Wall(String color,String material, boolean isInner, boolean isWarmed) {
        this.color = color;
        this.material = material;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    public Wall(int length, int width, String color,String material, boolean isInner, boolean isWarmed) {
        super(length, width);
        this.color = color;
        this.material = material;
        this.isInner = isInner;
        this.isWarmed = isWarmed;
    }

    // GETTERS AND SETTERS


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isInner() {
        return isInner;
    }

    public void setInner(boolean inner) {
        isInner = inner;
    }

    public boolean isWarmed() {
        return isWarmed;
    }

    public void setWarmed(boolean warmed) {
        isWarmed = warmed;
    }

    // toString , hashCode , equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wall wall = (Wall) o;
        return isInner() == wall.isInner() && isWarmed() == wall.isWarmed()
                && Objects.equals(getColor(), wall.getColor())
                && Objects.equals(getMaterial(), wall.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getColor(), getMaterial(), isInner(), isWarmed());
    }

    @Override
    public String toString() {
        return "Wall{" + super.toString() +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", isInner=" + isInner +
                ", isWarmed=" + isWarmed +
                '}';
    }
}

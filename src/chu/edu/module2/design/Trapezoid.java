package chu.edu.module2.design;

import java.util.Objects;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class Trapezoid
 * @since 19.03.2021 - 15.03
 **/
public class Trapezoid {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    //Getters/Setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }
    // Constructors
    public Trapezoid() {
    }

    public Trapezoid(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }
    //metod1 - Perimeter
    public double getPerimeter(){
        return this.getSideA() + this.getSideB() + this.getSideC() + this.getSideD();
    }
    //metod2 - Semi-Perimeter
    public double getHalfPerimeter(){
        return (getPerimeter() / 2 );
    }
    //metod3 - Midlane
    public double getMidLane(){
        return (this.getSideB() + this.getSideD()) / 2 ;
    }
    //metod4 - Area
    public double getArea(){
        return  (this.getSideD() + this.getSideB() / (this.getSideD() - this.getSideB()) *
                Math.sqrt((getHalfPerimeter() - this.getSideD()) * (getHalfPerimeter() - this.getSideB()) *
                (getHalfPerimeter() - this.getSideD() - this.getSideA()) * (getHalfPerimeter() - this.getSideD() - this.getSideC())));
    }
    //metod5 - Hight
    public double getHight() {
        return (getArea() / getMidLane());
    }
    //equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trapezoid trapezoid = (Trapezoid) o;
        return Double.compare(trapezoid.getSideA(), getSideA()) == 0 && Double.compare(trapezoid.getSideB(), getSideB()) == 0 && Double.compare(trapezoid.getSideC(), getSideC()) == 0 && Double.compare(trapezoid.getSideD(), getSideD()) == 0;
    }
    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getSideC(), getSideD());
    }
    // toString() method
    @Override
    public String toString() {
        return "Trapezoid {" +
                "sideA = " + sideA +
                ", sideB = " + sideB +
                ", sideC = " + sideC +
                ", sideD = " + sideD +
                '}';
    }
}


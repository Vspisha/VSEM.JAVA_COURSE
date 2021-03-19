package chu.edu.module2.design;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class MainTrapezoid
 * @since 19.03.2021 - 15.12
 **/
public class MainTrapezoid {
    public static void main(String[] args) {
        Trapezoid t1 = new Trapezoid(6,3,7,5);
        System.out.println(t1.toString());
        System.out.println("Perimeter = " + t1.getPerimeter());
        System.out.println("Semi-perimeter = " + t1.getHalfPerimeter());
        System.out.println("Area = " + t1.getArea());
        System.out.println("MidLane = " + t1.getMidLane());
        System.out.println("Hight = " + t1.getHight());
        //System.out.println(t1.equals());
        System.out.println("hashCode - " + t1.hashCode());
    }
 /*   Trapezoid {sideA = 6.0, sideB = 3.0, sideC = 7.0, sideD = 5.0}
    Perimeter = 21.0
    Semi-perimeter = 10.5
    Area = 22.24859546128699
    MidLane = 4.0
    Hight = 5.562148865321747
    hashCode - 175511425*/
}

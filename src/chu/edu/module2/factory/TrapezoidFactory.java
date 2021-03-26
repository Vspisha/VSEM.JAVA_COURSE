package chu.edu.module2.factory;

import chu.edu.module2.design.Quadrat;
import chu.edu.module2.design.Trapezoid;
import chu.edu.module2.polimorphism.Trapezoid2;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class TrapezoidFactory
 * @since 26.03.2021 - 17.25
 **/
public class TrapezoidFactory {
    public static Trapezoid2 create(double sideA, double sideB, double sideC, double sideD) {
        if (sideA == sideB && sideB == sideC && sideC == sideD) {
            return null;
        } else if (sideB == sideD) {
            return null;
        }
        return new Trapezoid2(sideA, sideB, sideC, sideD);
    }
}

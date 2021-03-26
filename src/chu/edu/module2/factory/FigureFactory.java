package chu.edu.module2.factory;

import chu.edu.module2.design.Quadrat;
import chu.edu.module2.design.Triangle;
import chu.edu.module2.polimorphism.Interfaces.IGeometry;
import chu.edu.module2.polimorphism.Trapezoid2;

/**
 * @author Radyslav Churkin
 * @version 1.0.0
 * @project VSEM
 * @class FigureFactory
 * @since 24.03.2021 - 19.53
 **/
public class FigureFactory {
    public static IGeometry create(double sideA, double sideB, double sideC, double sideD) {
        if (sideA == sideB && sideB == sideC && sideC == sideD) {
            return new Quadrat((int) sideA);
        } else if (sideA == sideC && sideB == sideD) {
            return new Rectangle3((int) sideA, (int) sideB);
        }
        return new Trapezoid2(sideA, sideB, sideC, sideD);
    }

    public static IGeometry create(int sideA, int sideB) {
        if (sideA == sideB) {
            return new Quadrat(sideA);
        }
        return new Rectangle3(sideA, sideB);
    }

    public static IGeometry create(double sideA, double sideB) {
        double sideC = Math.sqrt(sideA * sideA + sideB * sideB);
        return new Triangle(sideA, sideB, sideC);
    }

    public static IGeometry create(double sideA, double sideB, double sideC, double sideD, Figures figures) {
        if (figures.equals(Figures.RECTANGLE)) return new Rectangle3((int) sideA, (int) sideB);
        if (figures.equals(Figures.QUADRAT)) return new Quadrat((int) sideA);
        if (figures.equals(Figures.TRAPEZOID)) return new Trapezoid2(sideA, sideB, sideC, sideD);

        return null;
    }


}

package chu.edu;

import chu.edu.module2.design.FullTimeWorker;
import chu.edu.module2.design.PartTimeWorker;
import chu.edu.module2.design.Triangle;
import chu.edu.module2.factory.*;
import chu.edu.module2.inheritance.Employee;
import chu.edu.module2.inheritance.Rectangle;
import chu.edu.module2.inheritance.SoftwareDesigner;
import chu.edu.module2.inheritance.Wall;
import chu.edu.module2.polimorphism.Interfaces.IAccouting;
import chu.edu.module2.polimorphism.Interfaces.IGeometry;
import chu.edu.module2.polimorphism.Rectangle2;
import chu.edu.module2.polimorphism.Trapezoid2;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle();
        int l1= r1.getLength();
        System.out.println(l1);
        r2.setLength(16);
        r2.setWidth(7);
        System.out.println(r2.toString());
        Rectangle r3 = new Rectangle(15,7);
        System.out.println(r2.equals(r3));
        System.out.println(r2.hashCode());
        System.out.println(r3.hashCode());
        System.out.println(r1.getArea());
        r1.setWidth(-9);
        System.out.println(r1);

        Wall w1= new Wall(4,3,"Green","beton",true,true);
        Rectangle2 rec2 = new Rectangle2(3,4);
        System.out.println(rec2.toJSON());
        System.out.println(rec2.toXML());

        SoftwareDesigner d1 = new SoftwareDesigner();
        Employee d2 = new SoftwareDesigner();
        // Employee e1 = new Employee() ; так нельзя
        IAccouting f1 = new FullTimeWorker();
        IAccouting f2 = new PartTimeWorker();

        Rectangle3 r22 = new Rectangle3(3,4);
        Rectangle3 r33 = RectangleFactory.create(3,4);
        System.out.println(r22);
        System.out.println(r33);
        Triangle t1 = new Triangle(3,4,5);
        System.out.println(t1);
        Triangle t34 = TriangleFactory.create(1,1,10);
        System.out.println(t34);
        System.out.println(Rectangle3.getArea(7, 8));
        double x = Math.sqrt(2);
        Trapezoid2 tr1 = TrapezoidFactory.create(10,10,10,15);
        System.out.println(tr1);
        IGeometry g1 = FigureFactory.create(11,10,11,10);
        System.out.println(g1);
    }
}

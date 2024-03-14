import baseFold.Point2D;
import baseFold.Figure;

import java.util.Scanner;

public class Main extends Figure {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{

        Point2D[] mass = new Point2D[4];
        for(int i = 0; i < mass.length; i++)
            mass[i] = inputPoint2d();
        for (Point2D point: mass)
            System.out.println(point);
        System.out.println("pre test:");
        System.out.println(computeArea(mass[0],mass[1],mass[2]));
        System.out.println(computeArea(mass[0],mass[1],mass[2],mass[3]));

        //Точка
        Point2D test1 = new Point2D();
        //System.out.println(computeArea(10,2,"quadro"));

        /*Треугольник
        System.out.println("Triangle class)");
        Triangle test = new Triangle();
        System.out.println(test.computeArea());
        System.out.println(test.computeArea());
        System.out.println(test.getPerimetr());
        */

        //квадрат
        System.out.println("Quadro class)");
        Quadro test2 = new Quadro();
        System.out.println(test2.computeArea());
        System.out.println(test2.computeArea());
        System.out.println(test2.getPerimetr());

        //ромб
        //параллелограмм
        //просто многоугольник
    }



    private static double distanceBetweenPoint(Point2D p1, Point2D p2)
    {
        // Дистанция между двумя точками считается по формуле AB = ?(xb - xa)^2 + (yb - ya)^2 + (zb - za)^2
        // Math.pow возведение в степень
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static double computeArea(Point2D p1, Point2D p2, Point2D p3)
    {
        // Считаем стороны как растояние между двумя точками
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p1);
        return computeArea(sideA, sideB, sideC);
    }

    public static double computeArea(Point2D p1, Point2D p2, Point2D p3, Point2D p4)
    {
        double sideA = distanceBetweenPoint(p1, p2);
        double sideB = distanceBetweenPoint(p2, p3);
        double sideC = distanceBetweenPoint(p3, p4);
        double sideD = distanceBetweenPoint(p4, p1);
        return computeArea(sideA,sideB,sideC,sideD);
    }

    public static double computeArea(double sideA, double sideB, double sideC)
    {
        double s = ((sideA) + (sideB) + (sideC))/2; // полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула герона.  Math.sqrt - корень квадратный
    }

    public static double computeArea(double sideA, double sideB, double sideC, double sideD)
    {
        double s = (sideA + sideB + sideC + sideD) / 2;
        return Math.sqrt((s - sideA) * (s - sideB) * (s - sideC) * (s - sideD));
    }

    public static double computeArea(double side, double height, String type) throws Exception {
        if (type.equals("triangle"))
            return side * height/2;
        else if (type.equals("quadro"))
            return  side * height;
        else throw new Exception("Wrong type");
    }

}

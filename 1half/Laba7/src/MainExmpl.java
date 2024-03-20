import baseFold.Point2D;

import java.util.Scanner;

public class MainExmpl {
    public static Point2D inputPoint2d(){
        Point2D inp;
        inp = new Point2D();
        double x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inp X:");
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
            inp.setX(x);
        }
        else {
            inp.setX(0);
        }
        System.out.println("Inp Y:");
        if (sc.hasNextDouble()) {
            y = sc.nextDouble();
            inp.setY(y);
        }
        else {
            inp.setY(0);
        }

        return inp;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{

        Point2D[] mass = new Point2D[4];
        for(int i = 0; i < mass.length; i++)
            mass[i] = inputPoint2d();
        for (Point2D point: mass)
            System.out.println(point);
        System.out.println(computeArea(mass[0],mass[1],mass[2]));
        System.out.println(computeArea(mass[0],mass[1],mass[2],mass[3]));

        Point2D test1 = new Point2D();
        System.out.println(computeArea(10,2,"1"));


        Triangle test = new Triangle();
        System.out.println(test.computeArea());
        System.out.println(test.computeArea());
        System.out.println(test.getPerimetr());
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

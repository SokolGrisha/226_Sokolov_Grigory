import baseFold.Figure;
import baseFold.Point2D;

public class Triangle extends Figure {
    public Triangle()
    {
        perimetr = 0;
        area = 0;
        points = new Point2D[3];
        sides = new double[3];
        type = "triangle";

        while (!checkTriangle()) {
            inputTriangle();
            calcSides();
            if (!checkTriangle())
                System.err.println("Wrong points! Can't build triangle, try again!");
        }
        perimetr = computePerimetr();
        area = computeArea();
    }

    private void inputTriangle() {inputPoint2d();}

    private void calcSides()
    {
        for (int i = 0; i < sides.length; i++)
            sides[i] = distanceBetweenPoint(points[i], points[(i+1)%sides.length]);
    }

    private static double distanceBetweenPoint(Point2D p1, Point2D p2)
    {
        // Дистанция между двумя точками считается по формуле AB = ?(xb - xa)^2 + (yb - ya)^2 + (zb - za)^2
        // Math.pow возведение в степень
        return Math.sqrt(
                Math.pow((p1.getX() - p2.getX()), 2) +
                        Math.pow(p1.getY() - p2.getY(), 2));
    }

    private boolean checkTriangle()
    {
        return (sides[0] < sides[1] + sides[2]) && (sides[1] < sides[2]+ sides[0]) && (sides[2] < sides[0] + sides[1]);
    }




}

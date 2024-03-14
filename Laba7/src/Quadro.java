import baseFold.Figure;
import baseFold.Point2D;

public class Quadro extends Figure{
    public Quadro(){
        perimetr = 0;
        area = 0;
        points = new Point2D[4];
        sides = new double[4];
        type = "quadro";

        while (!checkQuadro()) {
            inputQ();
            calcSides();
            if (!checkQuadro())
                System.err.println("Wrong points! Can't build triangle, try again!");
        }

        perimetr = computePerimetr();
        area = computeArea();
    }

    private void inputQ() {inputPoint2d();}

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

    private boolean CheckPoints(Point2D a, Point2D b){
        return (b.getX()!=a.getX()||b.getY()!=a.getY());
    }
    private boolean CheckPointsP(Point2D a, Point2D b){
        try {
            return (b.getX() == a.getX() && b.getY() != a.getY()) || (b.getX() != a.getX() && b.getY() == a.getY());
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    private boolean checkQuadro()
    {

        int p = 0;
        try {
            for (int i = 0; i < points.length; i++) {
                for (int j = 0; j < points.length; j++) {
                    if (i != j && CheckPointsP(points[i], points[j])) {
                        p++;
                    }
                }
            }
        }
        catch (NumberFormatException e){
            p=0;
        }
        return (p==8);
    }
}

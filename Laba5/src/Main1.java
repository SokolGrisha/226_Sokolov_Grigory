import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Point3d a,b,c;
        System.out.println("Point A");
        a = InputDot();
        System.out.println("Point B");
        b = InputDot();
        System.out.println("Point C");
        c = InputDot();
        if (a.isNotCopy(b)&&b.isNotCopy(c)&&c.isNotCopy(a)) {
            System.out.println("Area of Triangle: " + computeArea(a, b, c));
        }
        else {
            System.out.println("Error some of points is same");
        }
    }

    public static Point3d InputDot() {
        Point3d inp;
        inp = new Point3d();
        double x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inp X:");
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
            inp.setX(x);
        }
        System.out.println("Inp Y:");
        if (sc.hasNextDouble()) {
            y = sc.nextDouble();
            inp.setY(y);
        }
        System.out.println("Inp Z:");
        if (sc.hasNextDouble()) {
            z = sc.nextDouble();
            inp.setZ(z);
        }
        return inp;
    }

    public static double computeArea(Point3d a, Point3d b, Point3d c){
        double ans;
        double la=a.distanceTo(b);
        double lb=b.distanceTo(c);
        double lc=c.distanceTo(a);
        double p = (la+lb+lc)/2;
        ans = Math.sqrt(p*(p-la)*(p-lb)*(p-lc));
        return ans;
    }

    public static void Task2() {
        System.out.println("Task 2");
        double funt = 1.487;
        double frank = 0.172;
        double mark = 0.584;
        double yen = 0.00955;
        double dol = 0;
        System.out.println("Input dollars (exmp:12.4):");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            dol = sc.nextDouble();
        }
        System.out.println(String.format("%.3f",(dol/funt))+" british pount");
        System.out.println(String.format("%.3f",(dol/mark))+" german marks");
        System.out.println(String.format("%.3f",(dol/yen))+" yens");

    }


}


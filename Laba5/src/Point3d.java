import java.text.DecimalFormat;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d () {

        this(0, 0,0);
    }
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public double getZ () {
        return zCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
    public void setZ ( double val) {
        zCoord = val;
    }
    public double distanceTo(Point3d b){
        DecimalFormat df = new DecimalFormat("0.##");
        return Double.valueOf(df.format(Math.sqrt(Math.pow(xCoord - b.getX(), 2) + Math.pow(yCoord - b.getY(), 2) + Math.pow(zCoord - b.getZ(), 2))));
    }
    public boolean isNotCopy(Point3d b){
        if(b.getX()!=this.getX()||b.getY()!=this.getY()||b.getZ()!=this.getZ()){
            return true;
        }
        else {
            return false;
        }
    }


}

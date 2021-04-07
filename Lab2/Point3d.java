package point3d;
import java.text.DecimalFormat;

public class Point3d {

    private double xCoord;
    private double yCoord;
    private double zCoord;
    
    
    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }
    
    public double getX(){
        return xCoord;
    }
    
    public double getY(){
        return yCoord;
    }
    
    public double getZ(){
        return zCoord;
    }
    
    public void setX(double value){
        xCoord = value;
    }
    
    public void setY(double value){
        zCoord = value;
    }
    
    public void setZ(double value){
        zCoord = value;
    }
    
    public static boolean isCoordEqual(Point3d firstCoord, Point3d secondCoord){
        if (firstCoord.getX() == secondCoord.getX() && firstCoord.getY() == secondCoord.getY() && firstCoord.getZ() == secondCoord.getZ()) {
            return true;
        }
        else return false;
    }
    
    public static String distanceToXY(Point3d coord){
        DecimalFormat df = new DecimalFormat("#.##");
        String distance = df.format(coord.getX() - coord.getY());
        return "Расстояние от точки X до точки Y = " + distance;
    }
    
    public static String distanceToXZ(Point3d coord){
        DecimalFormat df = new DecimalFormat("#.##");
        String distance = df.format(coord.getX() - coord.getZ());
        return "Расстояние от точки X до точки Z = " + distance;
    }
    
    public static String distanceToYZ(Point3d coord){
        DecimalFormat df = new DecimalFormat("#.##");
        String distance = df.format(coord.getY() - coord.getZ());
        return "Расстояние от точки Y до точки Z = " + distance;
    }

    public static void main(String[] args) {
   
        
        Point3d myPoint = new Point3d(5, 5, 4);
        Point3d mySecondPoint = new Point3d(5, 2, 5);
        Point3d myThirdPoint = new Point3d(7, 8, 2);
        
        // вывод равенства 2-ух точек
        System.out.println(isCoordEqual(myPoint, mySecondPoint));
        
        // вывод расстояния между 2-мя точками
        System.out.println(distanceToXY(myThirdPoint));
        System.out.println(distanceToXZ(myThirdPoint));
        System.out.println(distanceToYZ(myThirdPoint));
    }
    
}

import java.lang.Math;

public class Point {

    public double x, y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distanceToPoint(Point otherPoint){
        double xDiff = otherPoint.x - this.x;
        double yDiff = otherPoint.y - this.y;

        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

}

public class Point {

    public double x, y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point middle(Point p1, Point p2){
        return Point(p1.x + p2.x / 2, p1.y + p2.y / 2);
    }
}

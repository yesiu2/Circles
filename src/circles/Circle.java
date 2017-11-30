package circles;

public class Circle extends Point {

    double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public Point maxNorth(double x, double y, double radius) {
        return new Point (x, y+radius);
    }

    public Point maxSouth(double x, double y, double radius) {
        return new Point(x, y - radius);
    }

    public Point maxEast(double x, double y, double radius) {
        return new Point(x + radius, y);
    }

    public Point maxWest(double x, double y, double radius) {
        return new Point(x - radius, y);
    }
}

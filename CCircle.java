public class CCircle extends SShape {
    private double radius;

    public CCircle() {
        this.radius = 1.0;
    }

    public CCircle(double radius) {
        this.radius = radius;
    }

    public CCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle dengan radius=" + radius + ", " + super.toString();
    }
}

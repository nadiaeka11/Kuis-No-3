public class RRectangle extends SShape {
    private double width;
    private double length;

    public RRectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public RRectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public RRectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = length; // Update width to maintain proportion of square
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle dengan width=" + width + " dan length=" + length + ", " + super.toString();
    }
}

public class SSquare extends RRectangle {
    public SSquare() {
        super();
    }

    public SSquare(double side) {
        super(side, side);
    }

    public SSquare(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Square hanya punya 1 sisi (lebar dan panjang sama)
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString() {
        return "Square dengan sisi=" + getSide() + ", " + super.toString();
    }
}
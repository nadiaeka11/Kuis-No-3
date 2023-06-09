public class SShape {
    private String color;
    private boolean filled;

    public SShape() {
        this.color = "red";
        this.filled = true;
    }

    public SShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Shape berwarna " + color + " dan filled " + filled;
    }
}
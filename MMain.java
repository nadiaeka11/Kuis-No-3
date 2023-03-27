public class MMain {
    public static void main(String[] args) {
        // membuat objek Circle
        CCircle circle1 = new CCircle();
        CCircle circle2 = new CCircle(2.5);
        CCircle circle3 = new CCircle(3.0, "brown", false);

        // memanggil method pada objek Circle
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Filled: " + circle1.isFilled());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Filled: " + circle2.isFilled());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println(circle2.toString());
        System.out.println();

        System.out.println("Circle 3:");
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Color: " + circle3.getColor());
        System.out.println("Filled: " + circle3.isFilled());
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Perimeter: " + circle3.getPerimeter());
        System.out.println(circle3.toString());
        System.out.println();

        // membuat objek Rectangle
        RRectangle rectangle1 = new RRectangle();
        RRectangle rectangle2 = new RRectangle(2.5, 3.0);
        RRectangle rectangle3 = new RRectangle(4.0, 5.0, "yellow", true);

        // memanggil method pada objek Rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Filled: " + rectangle1.isFilled());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println(rectangle1.toString());
        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Filled: " + rectangle2.isFilled());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.toString());
        System.out.println();

        System.out.println("Rectangle 3:");
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Color: " + rectangle3.getColor());
        System.out.println("Filled: " + rectangle3.isFilled());
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.toString());
        System.out.println();
    }
}
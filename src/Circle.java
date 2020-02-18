public class Circle {
    private static final double PI = 3.14159265359;
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

public class main {
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        System.out.println("Radius before change: " + c.getRadius());
        System.out.println("Area before change: " + c.getArea());
        c.setRadius(4.0);
        System.out.println("Radius after change: "+ c.getRadius());
        System.out.println("Area after change: "+ c.getArea());
    }
}

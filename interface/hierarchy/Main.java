import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3);

        Vector<Shape> s = new Vector<Shape>();
        s.add(rectangle);
        s.add(circle);

        double totalluas = getTotal(s);
        System.out.println(totalluas);
        
    }

    void getArea() {}

    static double getTotal(Vector<? extends Shape> v) {
        double totalArea;
        totalArea = 0;
        for(Shape s : v) {
            Class<?>[] interfaces = s.getClass().getInterfaces();
            totalArea += s.getArea();
            for (Class<?> iface : interfaces) {
                System.out.println(iface.getName());
            }
        }



        return totalArea;
    }

}
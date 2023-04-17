/* Simple interface example using container (Vector/similar to ArrayList) and a method to get the total Area 
 * area is calculated by calling the getArea() method of the Shape class (which is implemented by the Rectangle and Circle class
*/
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

    static double getTotal(Vector<Shape> v) {
        double totalArea;
        totalArea = 0;
        for(Shape s : v) {
            totalArea += s.getArea();
        }
        return totalArea;
    }
}
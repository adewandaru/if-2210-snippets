/* TUGAS: ARGUMEN LENGTH DAN WIDTH DIAMBIL DARI CLI */
/* compile: javac HelloWorld.java -cp . */
/* letakkan HelloWorld.java di sebuah directory yang sama
 * dengan subdirectory "com" sbb
 * com/example/utilities/
 * HelloWorld.java
*/
import com.example.utilities.RectangleUtils;

public class HelloWorld {
    public static void main(String[] args) {

        double length = 5.0;
        double width = 3.0;

        double area = RectangleUtils.calculateArea(length, width);

        System.out.println("The area of the rectangle is: " + area);
    }
}



import java.util.ArrayList;
import java.util.List;


public class WildcardExample {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(3);
        intList.add(8);
        intList.add(3);

        // intList = [ 1, 2, 3, 3, 8, 3 ]
        // index       0  1  2  3  4  5

        System.out.println( intList.get(0) );
        System.out.println( intList.lastIndexOf(3) );

        // Create a list of strings
        List<String> strList = new ArrayList<String>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Cherry");

        // Call the printList method with both lists
        //printList(intList);
        //printList(strList);
    }

    // Generic method to print elements of a list with unknown type
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }
}






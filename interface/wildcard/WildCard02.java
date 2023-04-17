import java.util.*;

public class WildCard02 {
    
static void printListOfObjects(List<Object> l) {
    for (Object e: l) System.out.println(e);
}

static void printListOfUnknowns(List<?> l) {
    for (Object e: l) System.out.println(e);
}

static void printSetofUnknowns(Set<?> s) {
    for (Object e: s) System.out.println(e);
}

public static void main(String[] args) {
    // Principle of generic Invariance
    // Event though X is a subtype of Object, but the Generic type (List<X>) is NOT a subtype of List<Object>
    
    // examples: 
    // List<Object> is a subtype of List<?>
    // List<String> is a subtype of List<?>
    // List<String> is NOT a subtype of List<Object>

    // compile error because of type mismatch: 
    // List<Object> lo = new ArrayList<String>(); 

    List<Object> lo = new ArrayList<Object>(); // OK
    List<?> lu = new ArrayList<String>();      // OK
    List<String> ls = new ArrayList<String>(); // OK
    printListOfObjects(lo); // OK

    // compile error because of type mismatch: list of unknowns is not a subtype of list of objects
    // printListOfObjects(lu); // compile error

    // compile error because of type mismatch: list of string is not a subtype of list of objects
    // printListOfObjects(ls); // compile error

    printListOfUnknowns(lo); // OK
    printListOfUnknowns(lu); // OK
    printListOfUnknowns(ls); // OK

    // List of Unknown is useful to read values, but cannot add values

    // lu.add("Hello"); // compile error
    Set<?> su = new HashSet<String>(); // OK
    //su.add("Hello"); // compile error
    Set<String> ss = new HashSet<String>(); // OK
    ss.add("Hello"); // OK
    ss.add("World!"); // OK

    su = ss; // OK, treating set of strings as set of unknowns
    printSetofUnknowns(su); // OK
}

}
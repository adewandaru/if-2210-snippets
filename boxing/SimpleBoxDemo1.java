class SimpleBox  {
    private Object object;

    public void put(Object object) { this.object = object; }

    public Object get() { return object; }


}

public class SimpleBoxDemo1 {

    public static void main(String[] args) {

        // ONLY place Integer objects into this box!​

        SimpleBox intBox = new SimpleBox();

        intBox.put(10);

        int someInt = (int) intBox.get();

        System.out.println(someInt);

        System.out.println("---");
        Object O;
        int x = 11;
        O = x;
        System.out.println(O.getClass().getName());
        //System.out.println(x.getClass().getName());


    }
}

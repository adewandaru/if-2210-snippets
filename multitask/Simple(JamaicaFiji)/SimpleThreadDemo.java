/* this example extends Thread instead of implements runnable
 * new thread is created by calling start() on the thread object (new MyThread("Jamaica").start()
 */
class MyThread extends Thread {
    String s;
    public MyThread(String str) {
        s = str;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(s);
            try { Thread.sleep(1000); }
            catch (Exception e) {}
        }
    }
}

public class SimpleThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Jamaica");
        MyThread t2 = new MyThread("Fiji");
        t1.start();
        t2.start();
    }
}
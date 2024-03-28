class MyThread1 implements Runnable {
    public void run() {
        String msg1 = new String("Good Morning");
        while(true) {
            System.out.println(msg1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
class MyThread2 implements Runnable {
    public void run() {
        String msg2 = new String("Good Afternoon");
        while(true) {
            System.out.println(msg2);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Lab9_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread1());
        t1.start();
        Thread t2 = new Thread(new MyThread2());
        t2.start();
    }
}

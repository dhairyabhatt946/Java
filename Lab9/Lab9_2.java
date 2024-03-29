class MyThread1 extends Thread {
    public void run() {
        for(int i=1; i<20; i=i+2) {
            System.out.print(i+" ");
            try {
                sleep(1000);
            } catch(Exception e) {
                e.getMessage();
            }
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        for(int i=2; i<=20; i=i+2) {
            System.out.print(i+" ");
            try {
                sleep(1000);
            } catch(Exception e) {
                e.getMessage();
            }
        }
    }
}
public class Lab9_2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();  
    }
}
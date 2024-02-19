import java.util.Scanner;

class Counter {
    static int count;
    public Counter() {
        count++;
    }
}
public class Lab5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many objects to be created: ");
        int n = sc.nextInt();
        Counter[] c = new Counter[n];
        for(int i=0; i<c.length; i++) {
            c[i] = new Counter();
        }
        System.out.println("Number of static objects created = "+c[n-1].count);
    }
}

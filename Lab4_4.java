import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an integer array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<a.length; i++) {
            System.out.println("Enter an element in a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=a.length-1; i>=0; i--) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}

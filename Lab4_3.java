import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an integer array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum =0;
        double avg=0;
        for(int i=0; i<a.length; i++) {
            System.out.println("Enter an element in a["+i+"]: ");
            a[i] = sc.nextInt();
            sum = sum+a[i];
        }
        avg = (double)sum/n;
        System.out.println("Average = "+avg);
    }
}

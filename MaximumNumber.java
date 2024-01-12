import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of C: ");
        int c = sc.nextInt();
        int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Largest Number is "+max);
    }
}

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean flag = true;
        for(int i=0; i<a.length; i++) {
            System.out.println("Enter an element in a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find: ");
        int m = sc.nextInt();
        for(int i=0; i<a.length; i++) {
            if(a[i]==m) {
                System.out.println("Entered element is present.");
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Entered element is not present");
        }
    }
}

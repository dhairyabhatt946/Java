import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<a.length; i++) {
            System.out.println("Enter an element in a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                if(a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    
                }
            }
        }
        int lower=0, upper=a.length-1;
        int mid = (lower+upper)/2;
        System.out.println("Enter the element to find: ");
        int m = sc.nextInt();
        while(lower<upper) {
            mid = (lower+upper)/2;

            if(m==a[mid]) {
                System.out.println("Found");
                return;
            }
            else if(m<a[mid]) {
                upper = mid-1;
            }
            else if(m>a[mid]) {
                lower = mid+1;
            }
        }
        System.out.println("Not found");
        
        }
    }

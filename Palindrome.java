import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0, a=n;
        while(n!=0) {
            int rem = n%10;
            sum = sum*10+rem;
            n=n/10;
        }
        if(a==sum){
            System.out.println("Entered number is palindrome");
        }
        else{
            System.out.println("Entered number is not palindrome");
        }
    }
}

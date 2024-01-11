import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean prime = true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("Entered number is prime");
        }
        else{
            System.out.println("Entered number is not prime");
        }
    }
}

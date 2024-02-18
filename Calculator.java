import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of B: ");
        double b = sc.nextDouble();
        System.out.println("What do you want perform (+ for Addition, - for Subtraction, * for Multiplication, / for Division, % for Modulo): ");
        char c = sc.next().charAt(0);
        while(c!='+' && c!='-' && c!='*' && c!='/' && c!='%'){
                System.out.println("Enter valid character: ");
                c = sc.next().charAt(0);
        }
        switch(c){
            case '+':
            System.out.println("Addition = "+(a+b));
            break;
            case '-':
            System.out.println("Subtraction = "+(a-b));
            break;
            case '*':
            System.out.println("Multiplication = "+(a*b));
            break;
            case '/':
            while(b==0){
                System.out.println("Enter non zero value of B: ");
                b = sc.nextDouble();
            }
            System.out.println("Division = "+(a/b));
            break;
            case '%':
            while((int)b==0){
                System.out.println("Enter non zero value of B: ");
                b=sc.nextDouble();
            }
            int n1 = (int)(a%b);
            System.out.println("Modulo = "+n1);
            break;
        }
    }
}

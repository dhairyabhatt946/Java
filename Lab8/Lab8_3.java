import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}
class Account {
    double balance = 20000;
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("New balance = "+balance);
    }
    public void witrhdraw(double amount) throws Exception {
        if(amount>balance) {
            throw new InSufficientFundException("Amount to be withdrawn is greater than balance");
        }
        else {
            balance-=amount;
            System.out.println("New balance = "+balance);
        }
    }
}
public class Lab8_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("Enter 1 if you want to deposit money or 2 if you want to withdraw money");
        int n = sc.nextInt();
        if(n==1) {
            System.out.println("Enter amount to deposit");
            double amount = sc.nextDouble();
            a.deposit(amount);
        }
        else {
            System.out.println("Enter amount to withdraw");
            double amount = sc.nextDouble();
            try {
                a.witrhdraw(amount);
            } catch(InSufficientFundException ife) {
                System.out.println(ife.getMessage());
            }
        }
        sc.close();
    }    
}

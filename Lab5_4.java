import java.util.Scanner;

class Bank_Account {
    /*accountNo, userName, email, accountType and accountBalance, */
    int accountNo;
    String userName = new String();
    String email = new String();
    String accountType = new String();
    int accountBalance;
    public void getAccountDetails(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for account "+i);
        System.out.println("Enter account number");
        accountNo = sc.nextInt();
        System.out.println("Enter username");
        userName = sc.next();
        System.out.println("Enter email");
        email = sc.next();
        System.out.println("Enter account type");
        accountType = sc.next();
        System.out.println("Enter account balance");
        accountBalance = sc.nextInt();
    }
    public void displayAccountDetails(int i) {
        System.out.println("Account "+i);
        System.out.println("Account Number: "+accountNo);
        System.out.println("Username: "+userName);
        System.out.println("email: "+email);
        System.out.println("Account type: "+accountType);
        System.out.println("Account Balance: "+accountBalance);
    }
    
}
public class Lab5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many account details do you want to input?");
        int n = sc.nextInt();
        Bank_Account[] account_Details = new Bank_Account[n];
        for(int i=0; i<account_Details.length; i++) {
            account_Details[i] = new Bank_Account();
        }
        for(int i=0; i<account_Details.length; i++) {
            account_Details[i].getAccountDetails(i+1);
        }
        for(int i=0; i<account_Details.length; i++) {
            account_Details[i].displayAccountDetails(i+1);
        }
    }
}

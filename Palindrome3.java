import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        boolean prime = true;
        for(int i=0; i<s1.length()/2; i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)) {
                prime = false;
                break;
            }
        }
        if(prime) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

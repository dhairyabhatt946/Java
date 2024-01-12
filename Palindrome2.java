import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        String k="";
        for(int i=s1.length()-1; i>=0; i--){
            k=k+s1.charAt(i);
        }
        System.out.println(k);
        if(k.equals(s1)){
            System.out.println("Entered string is palindrome");
        }
        else{
            System.out.println("Enter string is not palindrome");
        }
    }
}
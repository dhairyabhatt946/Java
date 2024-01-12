import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:  ");
        String s1 = sc.nextLine();
        int length = s1.length();
        System.out.println("Length of the strring = "+length);
        System.out.println("Second half of the string is: ");
        for(int i=length/2; i<length; i++) {
            System.out.print(s1.charAt(i));
        }
    }
}

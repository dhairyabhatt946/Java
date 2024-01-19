import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        char ch;
        String s2 = new String("aeiou");
        String s3 = new String("bcdfghjklmnpqrstvwxyz");
        int vowel=0, consonant=0;
        for(int i=0; i<s1.length(); i++) {
            ch=s1.charAt(i);
            if(s2.indexOf(ch)!=-1) {
                vowel++;
            }
            else if(s3.indexOf(ch)!=-1) {
                consonant++;
            }
        }
        System.out.println("Vowels = "+vowel+" and Consonants = "+consonant);
    }
}

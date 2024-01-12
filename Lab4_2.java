import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        char ch;
        int vowel=0, consonant=0;
        for(int i=0; i<s1.length(); i++) {
            ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                vowel++;
            }
            else if(ch=='b' || ch=='c' || ch=='d' || ch=='f' || ch=='g' || ch=='h' || ch=='j' || ch=='k' || ch=='l' || ch=='m' || ch=='n' || ch=='p' || ch=='q' || ch=='r' || ch=='s' || ch=='t' || ch=='v' || ch=='w' || ch=='x' || ch=='y' || ch=='z' || ch=='B' || ch=='C' || ch=='D' || ch=='F' || ch=='G' || ch=='H' || ch=='J' || ch=='K' || ch=='L' || ch=='M' || ch=='N' || ch=='P' || ch=='Q' || ch=='R' || ch=='S' || ch=='T' || ch=='V' || ch=='W' || ch=='X' || ch=='Y' || ch=='Z'){
                consonant++;
            }
        }
        System.out.println("Vowels = "+vowel+" and Consonants = "+consonant);
    }
}

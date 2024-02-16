import java.util.Scanner;

class Vowel{
    String str;
    int count_a,count_e,count_i,count_o,count_u;
    Vowel(String str){
        this.str = str;
    }
    public void countEachVowel(String str){
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a') {
                count_a++;
            }
            else if(str.charAt(i) == 'e') {
                count_e++;
            }
            else if(str.charAt(i) == 'i') {
                count_i++;
            }
            else if(str.charAt(i) == 'o') {
                count_o++;
            }
            else if(str.charAt(i) == 'u') {
                count_u++;
            }
        }
        System.out.println("a = "+count_a+" e = "+count_e+" i = "+count_i+" o = "+count_o+" u = "+count_u);
    }
}
public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine().toLowerCase();
            if(str.equals("quit")) break;
            Vowel v = new Vowel(str);
            v.countEachVowel(str);
        }
    }
}

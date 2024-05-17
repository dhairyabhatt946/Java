import java.util.Scanner;
import java.io.*;

public class Lab10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to replace");
        String word1 = sc.next();
        System.out.println("By which word do you want to replace");
        String word2 = sc.next();
        sc.close();
        File f1 = new File("abc.txt");
        File f2 = new File("xyz.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
            String line = "";
            int count = 0;
            while((line = br.readLine())!=null) {
                String changedLine = "";
                String[] a = line.split(" ");
                for(int i=0; i<a.length; i++) {
                    if(a[i].equals(word1)) {
                        changedLine += word2+" ";
                        count++;
                    }
                    else {
                        changedLine += a[i]+" ";
                    }
                }
                bw.write(changedLine);
                bw.newLine();
            }
            System.out.println("Number of replacements = "+count);
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
import java.io.*;

public class Lab10_1 {
    public static void main(String[] args) {
        File f1 = new File("Lab10_1.txt");
        if(!f1.exists()) {
            System.out.println("File not found");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            int character_count=0, word_count=0, line_count=0;
            String line="";
            while((line=br.readLine())!=null) {
                line_count++;
                character_count+=line.length();
                String[] a = line.split(" ");
                word_count+=a.length;
            }
            System.out.println("Characters= "+character_count+", Words= "+word_count+", Lines= "+line_count);
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

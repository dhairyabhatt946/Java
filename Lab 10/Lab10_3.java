import java.io.*;

public class Lab10_3 {
    public static void main(String[] args) {
        File f1 = new File(args[0]);
        if(!f1.exists()) {
            System.out.println("File does not exist");
        }
        else {
            try {
                FileReader fr = new FileReader(f1);
                int data, countOf5=0;
                while((data = fr.read())!=-1) {
                    char dataChar = (char) data;
                    if(dataChar=='5') {
                        countOf5++;
                    }
                }
                fr.close();
                System.out.println("No of occurences of 5 = "+countOf5);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}

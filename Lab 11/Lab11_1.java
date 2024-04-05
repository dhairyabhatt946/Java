import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class Student {
    String name;
    int age;
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return  "Name: " + name + ", Age: " + age;
    }
}

public class Lab11_1 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Lab11_1.txt"));
            bw.write("Dhairya Bhatt,18");
            bw.newLine();
            bw.write("Viraj Odedra,18");
            bw.newLine();
            bw.write("Pruthviraj Chauhan,18");
            bw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("Lab11_1.txt"));
            String temp;
            while((temp = br.readLine())!=null) {
                String[] name_age = temp.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student students = new Student(name, age);
                System.out.println(students);
            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

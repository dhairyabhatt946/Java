import java.util.Scanner;

class Rectangle {
    static int length;
    static int breadth;
    public Rectangle() {
        length = 0;
        breadth = 0;
    }
    public void setRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void areaOfRectangle() {
        System.out.println("Area of rectangle = "+(length*breadth));
    }
}
public class Lab5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.println("Enter length of the rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth of the reatangle: ");
        int b = sc.nextInt();
        r.setRectangle(l, b);
        r.areaOfRectangle();
    }
}

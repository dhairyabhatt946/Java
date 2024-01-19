import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        int r = sc.nextInt();
        Circle a1 = new Circle();
        double res = a1.area(r);
        System.out.println("Area of circle = "+res);
    }
}
class Circle {
    public double area(int r) {
        double area = 3.14*r*r;
        return area;
    }
}

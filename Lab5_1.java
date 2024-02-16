import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter radius of the circle: ");
        c.radius = sc.nextInt();
        double result = c.area();
        System.out.println("Area of circle = "+result);
    }
}
class Circle {
    int radius;
    public double area() {
        return Math.PI * radius * radius;
    }
}

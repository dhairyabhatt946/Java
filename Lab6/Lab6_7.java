import java.util.Scanner;

final class AreaOfCircle {
    public final double PI = 3.141592653589793;
    public final void area(int radius) {
        double res = PI*Math.pow(radius, 2);
        System.out.println("Area of circle = "+res);
    }
}
public class Lab6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();
        AreaOfCircle c = new AreaOfCircle();
        c.area(radius);
    }
}

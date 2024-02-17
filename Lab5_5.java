import java.util.Scanner;

class ComplexNumber {
    double realPart;
    double imaginaryPart;
    public ComplexNumber() {
        realPart = 0;
        imaginaryPart = 0;
    }
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public ComplexNumber addComplexNumbers(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber res = new ComplexNumber();
        res.realPart = c1.realPart + c2.realPart;
        res.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;
        return res;
    }
}
public class Lab5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of complex number 1: ");
        double n = sc.nextDouble();
        System.out.println("Enter imaginary part of complex number 1: ");
        double m = sc.nextDouble();
        ComplexNumber c1 = new ComplexNumber(n, m);
        System.out.println("Enter real part of complex number 2: ");
        double l = sc.nextDouble();
        System.out.println("Enter imaginary part of complex number 2: ");
        double o = sc.nextDouble();
        ComplexNumber c2 = new ComplexNumber(l, o);
        ComplexNumber addResult = new ComplexNumber();
        addResult = addResult.addComplexNumbers(c1, c2);
        if(c1.realPart == 0) {
            System.out.println("c1 + c2 = "+addResult.imaginaryPart+"i");
        }
        else if(c2.imaginaryPart == 0) {
            System.out.println("c1 + c2 = "+addResult.realPart);
        }
        else {
            System.out.println("c1 + c2 = "+addResult.realPart+" + "+addResult.imaginaryPart+"i");
        }
    }
}

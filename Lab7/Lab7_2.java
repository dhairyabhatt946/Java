interface A {
    int a = 10;
    public void method_A();
}
interface A1 extends A {
    int a1 = 20;
    public void method_A1();
}
interface A2 extends A {
    int a2 = 30;
    public void method_A2();
}
interface A12 extends A1, A2 {
    int a12 = 40;
    public void method_A12();
}
class B implements A12 {
    public void method_A() {
        System.out.println("Constant in method_A is "+a);
    }
    public void method_A1() {
        System.out.println("Constant in methopd_A1 is "+a1);
    }
    public void method_A2() {
        System.out.println("Constant in method_A2 is "+a2);
    }
    public void method_A12() {
        System.out.println("Constant in method_A12 is "+a12);
    }
}
public class Lab7_2 {
    public static void main(String[] args) {
        B b = new B();
        b.method_A();
        b.method_A1();
        b.method_A2();
        b.method_A12();
    }    
}

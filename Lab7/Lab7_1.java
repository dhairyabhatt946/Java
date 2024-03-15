abstract class Vegetable {
    String color;
    abstract public String toString();
}
class Potato extends Vegetable {
    public Potato() {
        super.color = "Brown"; 
    }
    public String toString() {
        return "Vegetable: Potato, color: "+super.color;
    }
}
class Brinjal extends Vegetable {
    public Brinjal() {
        super.color = "Purple"; 
    }
    public String toString() {
        return "Vegetable: Brinjal, color: "+super.color;
    }
}
class Tomato extends Vegetable {
    public Tomato() {
        super.color = "Red"; 
    }
    public String toString() {
        return "Vegetable: Tomato, color: "+super.color;
    }
}
public class Lab7_1 {
    public static void main(String[] args) {
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();
        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
}

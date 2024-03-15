interface Transport {
    public void deliver();
}
abstract class Animal {
    
}
class Tiger extends Animal {
    
}
class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("Camel is used for delivering goods.");
    }
}
class Deer extends Animal {
    
}
class Donkey extends Animal implements Transport {
    public void deliver() {
        System.out.println("Donkey is used for delivering goods.");
    }
}
public class Lab7_3 {
   public static void main(String[] args) {
    Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};
    for(Animal animal : animals) {
        if (animal instanceof Transport) {
            Transport transportAnimal = (Transport) animal;
            transportAnimal.deliver();
        }
    }    
   } 
}

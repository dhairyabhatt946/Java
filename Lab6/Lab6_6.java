class Person { 
	public void message() { 
		System.out.println("This is person class\n"); 
	} 
} 
class Student extends Person { 
	public void message() { 
		System.out.println("This is student class"); 
	}
	public void display() { 
		message();
		super.message(); 
	} 
} 
public class Lab6_6 {
    public static void main(String args[]) { 
		Student s = new Student();
		s.display(); 
	}
}

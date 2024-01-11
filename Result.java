import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0, n, marks;
        System.out.println("Enter total subjects");
        n= sc.nextInt();
        System.out.println("Enter max marks: ");
        int totalMarks=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter the marks of subject ");
            marks = sc.nextInt();
            while(marks>totalMarks || marks<0){
                System.out.println("Enter valid marks: ");
                marks = sc.nextInt();
            }
            sum = sum + marks;
        }
        int n1=totalMarks*n;
        double pct = (double)(sum*100)/n1;
        if(pct>=60){
            System.out.println("First Division");
        }
        else if(pct>=50){
            System.out.println("Second Division");
        }
        else if(pct>=40){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }
}

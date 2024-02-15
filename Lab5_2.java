import java.util.Scanner;

class Time {
    int days;
    int hours;
    int minutes;
    int seconds;

    public Time(int n) {
        Scanner sc = new Scanner(System.in);
        if(n==0) {
            days = 0;
            hours = 0;
            minutes = 0;
            seconds = 0;
        }
        else{
            do{
                System.out.println("Enter hours for time "+n);
                hours = sc.nextInt();   
            }
            while(hours<0);
            do{
                System.out.println("Enter minutes for time "+n);
                minutes = sc.nextInt();   
            }
            while(minutes<0);
            do{
                System.out.println("Enter seconds for time "+n);
                seconds = sc.nextInt();   
            }
            while(seconds<0);
        }
    }
    public Time addTime(Time temp1 ,Time temp2) {
        Time newTime = new Time(0);
        newTime.hours = temp1.hours + temp2.hours;
        newTime.minutes = temp1.minutes + temp2.minutes;
        newTime.seconds = temp1.seconds + temp2.seconds;
        while(newTime.seconds>60) {
            newTime.seconds -= 60;
            newTime.minutes--;
        }
        while (newTime.minutes>60) {
            newTime.minutes -= 60;
            newTime.hours--;
        }
        while (newTime.hours>24) {
            newTime.hours -=24;
            newTime.days++;
        }
        return newTime;
    }
}
public class Lab5_2 {
    public static void main(String[] args) {
        Time t1 = new Time(1);
        Time t2 = new Time(2);
        Time res = new Time(0);
        res = res.addTime(t1, t2);
        System.out.println(res.days+" "+res.hours+" "+res.minutes+" "+res.seconds);
    }
}
import java.util.InputMismatchException;

public class Lab8_1 {
    public static int power(int x, int y) {
        int res = 1;
        for(int i=1; i<=y; i++) {
            res *= x;
        }
        return res;
    }
    public static void main(String[] args) {
        try {
            if(args.length == 2) {
                try {
                    int x = Integer.parseInt(args[0]);
                    int y = Integer.parseInt(args[1]);
                    int res = power(x, y);
                    System.out.println(x+" raise to "+y+" = "+res);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                throw new Exception("Insert two integer values.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

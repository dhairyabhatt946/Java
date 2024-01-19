public class Lab4_6 {
    public static void main(String[] args) {
        int length = args.length;
        for(int i=0; i<length; i++) {
            String str = args[i];
            if(args[i].charAt(0) <  65 || args[i].charAt(0) > 90) {
                System.out.println("Error: String at index "+i+" does not begin with upper case.");
                return;
            }
        }
        System.out.println("Done!!");
    }
}

public class Lab4_7 {
    public static void main(String[] args) {
        String s1 = "stream";
        for(int i=0; i<6; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(s1.charAt(j));
            }
            System.out.println();
        }
    }    
}

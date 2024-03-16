public class Lab8_2 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int[] arr = new int[n];
        
            int sum = 0;
            try {
                for(int i=0; i<n; i++) {
                    arr[i] = Integer.parseInt(args[i+1]);
                    try {
                        if(arr[i]>7000) {
                            throw new Exception(arr[i]+" is greater than 7000.");
                        }
                        if(arr[i]>1000 && arr[i]<2000) {
                            throw new Exception(arr[i]+" is greater than 1000 and less than 2000.");
                        }
                        if(arr[i]%10==0) {
                            throw new Exception(arr[i]+" is evenly divisible by 10.");
                        }
                        if(arr[i]<0) {
                            throw new Exception(arr[i]+" is negative.");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    sum += arr[i];
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Sum = "+sum);
        } catch (Exception e) {
            System.out.println("Negative index.");
        }
    }
}

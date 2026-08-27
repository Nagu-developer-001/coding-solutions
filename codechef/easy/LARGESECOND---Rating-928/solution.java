import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max = a[0];
            int SecondMax = a[0];
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    SecondMax = max;
                    max = a[i];
            }else if(a[i]>SecondMax && a[i]!=max){
                SecondMax = a[i];
            }
        }
        System.out.println(max+SecondMax);
    }
}
}
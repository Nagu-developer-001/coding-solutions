import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]==arr[i+1]){
                    arr[i] = arr[i+1];
                    N--;
                }
            }
            System.out.println(N);
        }
    }
}
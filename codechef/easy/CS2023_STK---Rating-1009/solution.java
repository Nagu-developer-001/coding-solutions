import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int streakOm = 0;
            int streakAddy = 0;
            int maxStreak1 = 0;
            int maxStreak2 = 0;
            for(int i=0;i<n;i++){
                if(b[i]>0){
                    streakAddy++;
                    maxStreak2 = Math.max(streakAddy,maxStreak2);
                }else{
                    streakAddy = 0;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]>0){
                    streakOm++;
                    maxStreak1 = Math.max(streakOm,maxStreak1);
                }else{
                    streakOm = 0;
                }
            }
            if(maxStreak1>maxStreak2){
                System.out.println("Om");
            }else if(maxStreak1<maxStreak2){
                System.out.println("Addy");
            }else{
                System.out.println("Draw");
            }

        }
        
        // Your code goes here
        }
}

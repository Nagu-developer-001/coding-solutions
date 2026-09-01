import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();

            String A = sc.next();

            long ones = 0;

            for (char ch : A.toCharArray()) {
                if (ch == '1') {
                    ones++;
                }
            }

            // If A contains only 0's
            if (ones == 0) {
                System.out.println(N * M);
                continue;
            }

            long totalOnes = ones * M;

            // If total number of 1's is odd
            if (totalOnes % 2 != 0) {
                System.out.println(0);
                continue;
            }

            long target = totalOnes / 2;

            long prefix = 0;
            long answer = 0;

            for (char ch : A.toCharArray()) {

                if (ch == '1') {
                    prefix++;
                }

                long remaining = target - prefix;

                if (remaining >= 0 && remaining % ones == 0) {

                    long k = remaining / ones;

                    if (k >= 0 && k < M) {
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}
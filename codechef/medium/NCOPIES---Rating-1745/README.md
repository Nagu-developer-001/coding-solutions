# NCOPIES - Rating 1745

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Copy and Paste

Chef has binary string $A$ of length $N$. He constructs a new binary string $B$ by concatenating $M$ copies of $A$ together. For example, if $A = \texttt{"10010"}$, $M = 3$, then $B = \texttt{"100101001010010"}$.

Chef calls an index $i$ $(1 \le i \le N \cdot M)$  *good*  if:

- $pref_i = suf_{i + 1}$.

Here, $pref_j = B_1 + B_2 + \ldots + B_j$ and $suf_j = B_{j} + B_{j + 1} + \ldots + B_{N \cdot M}$ (Note that $suf_{N \cdot M + 1} = 0$ by definition)

Chef wants to find the number of good indices in $B$. Can you help him do so?

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first line of each test case contains two space-separated integers $N$ and $M$ — the length of the binary string $A$ and the number of times $A$ is concatenated to form $B$.
- The second line of each test case contains a binary string $A$ of length $N$ containing $0$s and $1$s only.
### Output Format

For each test case, output the number of good indices in $B$.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N, M \leq 10^5$
- $A$ is a binary string, i.e, contains only the characters $0$ and $1$.
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
- The sum of $M$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
2 2
00
2 4
11
3 3
101

```

```
4
1
2

```

### Explanation:

 **Test case $1$:**  $B = \texttt{"0000"}$. In this string, all the indices are good.

 **Test case $2$:**  $B = \texttt{"11111111"}$. In this string, only $i = 4$ is good.

 **Test case $3$:**  $B = \texttt{"101101101"}$. In this string, $i = 4$ and $i = 5$ are good.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-01T13:37:33.810Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/NCOPIES)
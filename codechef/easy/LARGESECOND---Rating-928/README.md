# LARGESECOND - Rating 928

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Largest and Second Largest

You are given an array $A$ of $N$ integers.
Find the  **maximum**  sum of  **two distinct**  integers in the array.

 **Note:**  It is guaranteed that there exist at least two distinct integers in the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains single integer $N$ — the size of the array. The next line contains $N$ space-separated integers, denoting the array $A$.
### Output Format

For each test case, output on a new line, the maximum sum of two distinct integers in the array.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 1000$
- The sum of $N$ over all test cases does not exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
4 1 6
7
3 7 2 1 1 5 3
5
8 2 9 4 9
2
1 2
```

```
10
12
17
3
```

### Explanation:

 **Test case $1$:**  The maximum sum of two distinct elements is $4 + 6 = 10$.

 **Test case $2$:**  The maximum sum of two distinct elements is $7 + 5 = 12$.

 **Test case $3$:**  The maximum sum of two distinct elements is $8 + 9 = 17$.

 **Test case $4$:**  The maximum sum of two distinct elements is $1 + 2 = 3$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T13:01:05.728Z  

```java
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
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = a[i];
                } else if (a[i] > secondMax && a[i] != firstMax) {
                    secondMax = a[i];
                }
            }

            int maxSum = firstMax + secondMax;
            System.out.println(maxSum);
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LARGESECOND)
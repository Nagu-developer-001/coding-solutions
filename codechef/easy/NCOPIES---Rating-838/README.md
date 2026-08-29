# NCOPIES - Rating 838

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### MIN To MAX

You are given an array $A$ of size $N$.

Let $M$ be the  **minimum**  value present in the array initially.
In one operation, you can choose an element $A_i$ $(1\le i \le N)$ and an integer $X$ $(1\le X \le 100)$, and set $A_i = X$.

Determine the  **minimum**  number of operations required to make $M$ the  **maximum**  value in the array $A$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains a single integer $N$ - the size of the array. The next line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ - the elements of the array.
### Output Format

For each test case, output on a new line, the  **minimum**  number of operations required to make $M$ the  **maximum**  value in the array $A$.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 100$
- $1 \leq A_i \leq 100$
### Sample 1:
Input
Output

```
3
2
1 2
4
2 2 3 4
1
1

```

```
1
2
0
```

### Explanation:

 **Test case $1$:**  The minimum value in the array, $M$, is initially $1$. We can use one operation as following:

- Choose $A_2$ and set it as $X = 1$. Thus, the final array becomes $[1, 1]$.

Since all elements of the final array are $1$, the maximum value of the array is now $1$. It can be shown that this is the minimum number of operations required to do so.

 **Test case $2$:**  The minimum value in the array, $M$, is initially $2$. We can use two operations as following:

- Choose $A_4$ and set it as $X = 2$. Thus, the array becomes $[2, 2, 3, 2]$.
- Choose $A_3$ and set it as $X = 2$. Thus, the array becomes $[2, 2, 2, 2]$.

Since all elements of the final array are $2$, the maximum value of the array is now $2$.

 **Test case $3$:**  The minimum value in the array, $M$, is initially $1$. It is also the maximum value of the array. Hence, no operations are required.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-29T13:55:42.129Z  

```java
import java.util.Scanner;
class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here
            Arrays.sort(nums);
            int Fa = nums[0];
            int op = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>Fa){
                op++;
            }
        }
        return op;   
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/NCOPIES)
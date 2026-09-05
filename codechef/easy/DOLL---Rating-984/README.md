# DOLL - Rating 984

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Red Light, Green Light

 *“You won’t get caught if you hide behind someone.”* 

Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.

Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, $K$. Many players saw this trick and also started hiding behind Ali.

Now, there are $N$ players standing  *between*  Gi-Hun and Ali in a straight line, with the $i^{\text{th}}$ player having height $H_i$. Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.

 **Note:** 

- Line of sight is a straight line drawn between the topmost point of two objects. Ali is visible to Gi-Hun if nobody between them crosses this line.
- Even if there are some players who have the same height as that of Gi-Hun and Ali, Ali will be visible in Gi-Hun's line of sight.
- Gi-Hun and Ali have the same height.
### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains two space-separated integers $N$ and $K$, denoting the total number of players between Gi-Hun and Ali and the height of both of them respectively.
- The second line of each test case contains $N$ space-separated integers, denoting the heights of the players between Gi-Hun and Ali.
### Output Format

For each test case, output in a single line the minimum number of players who need to get shot so that Ali is visible in Gi-Hun's line of sight.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N \leq 10^5$
- $1 \leq K \leq 10^6$
- $1 \leq H_i \leq 10^6$ for every $1 \leq i \leq N$.
- The sum of $N$ across all test cases does not exceed $5\cdot 10^5$.
### Sample 1:
Input
Output

```
3
4 10
2 13 4 16
5 8
9 3 8 8 4
4 6
1 2 3 4
```

```
2
1
0
```

### Explanation:

 **Test Case 1:**  Gi-Hun and Ali have height $10$. For Ali to be visible to Gi-Hun, the second person (with height $13$) and the fourth person (with height $16$) need to get shot. Hence, the minimum number of players who need to get shot is $2$.

 **Test Case 2:**  Gi-Hun and Ali have height $8$. For Ali to be visible to Gi-Hun, the first person (with height $9$) needs to get shot. Hence, the minimum number of players who need to get shot is $1$.

 **Test Case 3:**  Nobody needs to get shot because everyone is shorter than Gi-Hun and Ali.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:25:21.071Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){
            int K = sc.nextInt();
            int N = sc.nextInt();
            int cnt = 0;
            for(int i=0;i<K;i++){
                int H = sc.nextInt();
                if(H>N){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DOLL)
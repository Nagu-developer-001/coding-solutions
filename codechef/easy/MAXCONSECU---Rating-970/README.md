# MAXCONSECU - Rating 970

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### The Squid Game

 *"Let the games begin."* 

Squid Game has become a blockbuster hit and the frontman is now finding it difficult to accommodate all the participants in Squid Game 2.0. So, he decided that he will allow only those participants who could solve the following problem.

There are a total of $N$ players who are competing in the Squid Game, numbered from $1$ to $N$. When the $i^{\text{th}}$ player gets eliminated from the game, $A_i$ amount of money is added to the prize pool. The game is played until $N-1$ players get eliminated, and the only player left is declared as the winner. The winner gets all the money present in the prize pool.

You are given an array $A$ consisting of $N$ elements, where $A_i$ denotes the prize money added to the prize pool when the $i^{\text{th}}$ player gets eliminated from the game. Find the maximum prize that the winner can get, given that you can choose any player to be the winner.

### Input Format
- The first line of input contains a single integer $T$, denoting the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains an integer $N$, denoting the number of players.
- The second line of each test case contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$, denoting the amount of money added to the prize pool when the $i^{\text{th}}$ ($1 \leq i \leq N$) player dies.
### Output Format

For each test case, output in a single line the maximum prize that the winner can get, given that you can choose any player to be the winner.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 10^5$
- $0 \leq A_i \leq 10^4$
- The sum of $N$ across all test cases does not exceed $10^6$.
### Sample 1:
Input
Output

```
3
3
3 1 2
5
1 1 1 1 1
6
3 6 4 2 5 1

```

```
5
4
20
```

### Explanation:

 **Test Case 1:** 

- If we choose the first player to be the winner, he will win the game when the second and third players die. Hence, the amount of money won by him will be $1+2 = 3$.
- If we choose the second player to be the winner, he will win the game when the first and third players die. Hence, the amount of money won by him will be $3+2 = 5$.
- If we choose the third player to be the winner, he will win the game when the first and second players die. Hence, the amount of money won by him will be $3+1 = 4$.

Therefore, we can clearly see that the maximum amount of money that can be won by any player is $5$.

 **Test Case 2:**  Irrespective of who is chosen, the winner will always win an amount of $4$.

 **Test Case 3:**  If we choose the sixth player to be the winner, the amount won by him will be $3 + 6 + 4 + 2 + 5 = 20$. It can be proven that if we choose any other player to be the winner, the amount is less than $20$. Hence, the maximum amount of money that can be won by any player is $20$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T05:37:52.986Z  

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
        while(t-->0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sm = 0;
            for(int i=1;i<N;i++){
                sm+=arr[i];
            }
            System.out.println(sm);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXCONSECU)
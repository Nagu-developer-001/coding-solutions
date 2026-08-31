# MAXCONSECU

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Consecutive Ones

Chef has a binary array $nums$ containing only $0$s and $1$s.
He wants to find the maximum number of consecutive $1$s in the array regardless of how many such streaks exist. Can you help Chef determine this?

## Function Declaration
### Function Name

$findMaxConsecutiveOnes$ - This function computes the maximum length of a contiguous segment of `1`s in a binary array.

### Parameters
- $nums$: A binary array of integers where each element is either 0 or 1.
### Return Value
- Returns a single integer representing the maximum number of consecutive 1s in the array.
## Constraints
- $1 \leq N \leq 10^5$
- $nums[i] \in {0, 1}$
### Input Format
- The first line contains a single integer $N$ — the size of the array.
- The second line contains $N$ space-separated integers representing the binary array $nums$.
### Output Format
- Print a single integer — the maximum number of consecutive 1s in the array.
### Sample 1:
Input
Output

```
5
0 1 1 0 1

```

```
2

```

### Explanation:

The two `1`s at positions 2 and 3 are consecutive, so the maximum streak is `2`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T12:30:39.910Z  

```java
    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int cnt = 0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]==1&&nums[i+1]==1){
               cnt+=2;
           }
       }
       return cnt;
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXCONSECU)
# SEARCHINARR - Rating 600

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Search an element in an array

You are given an array $A$ of size $N$ and an element $X$. Your task is to find whether the array $A$ contains the element $X$ or not.

## Function Declaration
### Function Name

$solve$ – This function checks whether a given element  **X**  is present in the array  **A**.

### Parameters
- $N$ : An integer representing the number of elements in the array.
- $X$ : An integer representing the element to be searched.
- $A$ : A list/array of integers of length N, representing the input array.
### Return Value
- Returns a string: "YES" if the element $X$ exists in the array $A$. "NO" if the element $X$ is not present in the array.
### Input Format
- The first line contains two space-separated integers $N$ and $X$ — the size of array and the element to be searched.
- The second line contains all the elements of array $A$
### Output Format

Output "YES" if the element $X$ is present in $A$, otherwise output "NO".

### Constraints
- $1 \leq N, X \leq 10^5$
- $1 \leq A_i \leq 10^5$
### Sample 1:
Input
Output

```
5 3
7 3 5 2 1
```

```
YES
```

### Sample 2:
Input
Output

```
5 10
7 3 5 2 1
```

```
NO
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T13:07:15.678Z  

```java
public static String solve(int N, int X, int[] A) {
    for(int i=0;i<N;i++){
        if(A[i]==X){
            return "YES";
            //break;
        }
    }
    return "NO";
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SEARCHINARR)
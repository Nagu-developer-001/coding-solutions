# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 34.37%)  
**Memory:** 107.8 MB (beats 67.48%)  
**Submitted:** 2026-10-02T15:55:14.308Z  

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> HS = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(HS.contains(n)){
                return true;
            }
            HS.add(n);
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)
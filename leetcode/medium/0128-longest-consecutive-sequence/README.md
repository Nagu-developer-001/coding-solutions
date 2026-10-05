# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return  *the length of the longest consecutive elements sequence.* 

You must write an algorithm that runs in `O(n)` time.

 

 **Example 1:** 

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

 **Example 2:** 

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

 **Example 3:** 

```
Input: nums = [1,0,1,2]
Output: 3

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 30 ms (beats 74.46%)  
**Memory:** 95.5 MB (beats 52.27%)  
**Submitted:** 2026-10-05T13:37:49.430Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longStreak = 0;
        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentCnt = 1;
                while(numSet.contains(currentNum+1)){
                    currentNum += 1;
                    currentCnt +=1;
                }
                longStreak = Math.max(currentCnt,longStreak);

            }
        }
        return longStreak;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)
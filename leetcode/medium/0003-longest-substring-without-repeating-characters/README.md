# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 38 ms (beats 77.95%)  
**Memory:** 47.7 MB (beats 87.51%)  
**Submitted:** 2026-10-16T18:05:33.602Z  

```java
import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        
        // Key: Character | Value: The index immediately AFTER its last seen position
        HashMap<Character, Integer> map = new HashMap<>(); 

        // 'l' is the left boundary, 'r' is the right boundary of our window
        for (int r = 0, l = 0; r < n; r++) {
            char curr = s.charAt(r);
            
            // 1. If we hit a duplicate character...
            if (map.containsKey(curr)) {
                // ...jump 'l' to the duplicate's next index. 
                // Math.max ensures 'l' never moves backwards into an old window.
                l = Math.max(map.get(curr), l);
            }
            
            // 2. Calculate current window size (r - l + 1) and update global max
            maxLength = Math.max(maxLength, r - l + 1);
            
            // 3. Store/update the character's "jump-to" position (index + 1)
            map.put(curr, r + 1); 
        }
        
        return maxLength;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
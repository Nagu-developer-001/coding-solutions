# Permutation in String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

 **Example 1:** 

```
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

```

 **Example 2:** 

```
Input: s1 = "ab", s2 = "eidboaoo"
Output: false

```

 

 **Constraints:** 

- 1 <= s1.length, s2.length <= 104
- s1 and s2 consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 86.99%)  
**Memory:** 43.3 MB (beats 99.55%)  
**Submitted:** 2026-10-18T16:19:35.833Z  

```java
import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Populate frequency array for s1 and the first window of s2
        for (int i = 0; i < n; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq1, freq2)) return true;

        // Slide the window across s2
        for (int i = n; i < m; i++) {
            // Add new character to the right of the window
            freq2[s2.charAt(i) - 'a']++;
            // Remove old character from the left of the window
            freq2[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/permutation-in-string/)
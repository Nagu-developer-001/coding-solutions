# Valid Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A phrase is a  **palindrome**  if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` *if it is a  **palindrome**, or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

```

 **Example 2:** 

```
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

```

 **Example 3:** 

```
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

 **Constraints:** 

- 1 <= s.length <= 2 * 105
- s consists only of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 55.69%)  
**Memory:** 44.3 MB (beats 62.39%)  
**Submitted:** 2026-10-08T15:23:34.292Z  

```java
class Solution {
    public boolean isAlphaNumeric(char ch){
        if(ch>='0' && ch<='9'||
           Character.toLowerCase(ch)>='a' && Character.toLowerCase(ch)<='z'){
            return true;
           }
        return false;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int st = 0,end=n-1;
        while(st<end){
            if(!isAlphaNumeric(s.charAt(st))){
                st++;
                continue;
            }
            else if(!isAlphaNumeric(s.charAt(end))){
                end--;
                continue;
            }
            else{
                if(Character.toLowerCase(s.charAt(st))!=
                Character.toLowerCase(s.charAt(end))) return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-palindrome/)
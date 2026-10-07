# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 83.11%)  
**Memory:** 43.3 MB (beats 40.39%)  
**Submitted:** 2026-10-07T16:28:43.952Z  

```java
class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' ||ch == '[' ||ch == '{'){
                s.push(ch);
            }else{
                if(s.isEmpty()) return false;
                if(ch == ')' && s.peek() == '(' ||
                   ch == '}' && s.peek() == '{' ||
                   ch == ']' && s.peek() == '['){
                    s.pop();
                   }
                else return false;
            }
        }
        if(s.isEmpty()) return true;
        else return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)
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

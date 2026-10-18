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

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st = 0;
        int end = numbers.length - 1;
        
        while (st < end) {
            int sum = numbers[st] + numbers[end]; // Calculate once per loop
            
            if (sum > target) {
                end--; // Sum is too large, move the right pointer left
            } else if (sum < target) {
                st++;  // Sum is too small, move the left pointer right
            } else {
                return new int[]{st + 1, end + 1}; // Found the target (1-based index)
            }
        }
        return new int[]{};
    }
}

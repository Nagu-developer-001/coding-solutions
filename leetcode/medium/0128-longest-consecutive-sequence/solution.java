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
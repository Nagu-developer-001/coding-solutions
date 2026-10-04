class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(count.containsKey(compliment)){
                return new int[]{count.get(compliment),i};
            }
            count.put(nums[i],i);
        }
        return new int[]{};
    }
}
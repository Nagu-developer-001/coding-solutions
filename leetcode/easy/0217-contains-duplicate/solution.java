class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> HS = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(HS.contains(n)){
                return true;
            }
            HS.add(n);
        }
        return false;
    }
}
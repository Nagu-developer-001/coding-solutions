class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum+=nums[i];
                if(sum==k)cnt++;
            }
        }
        return cnt;
    }
}
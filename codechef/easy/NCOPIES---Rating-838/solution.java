import java.util.Scanner;
class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here
            Arrays.sort(nums);
            int Fa = nums[0];
            int op = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>Fa){
                op++;
            }
        }
        return op;   
    }
}

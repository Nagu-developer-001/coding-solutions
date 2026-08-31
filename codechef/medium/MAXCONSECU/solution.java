    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int cnt = 0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]==1&&nums[i+1]==1){
               cnt+=2;
           }
       }
       return cnt;
    }

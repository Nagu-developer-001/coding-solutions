    public static int findMaxConsecutiveOnes(int[] nums) {
       //write code here...
       int streak = 0;
       int maxStreak = 0;
       for(int num : nums){
           if(num==1){
               streak += 1;
               maxStreak = Math.max(streak,maxStreak);
           }else{
               streak = 0;
           }
       }
       return maxStreak;
    }

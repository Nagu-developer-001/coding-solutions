class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> countMap = new HashMap<>();
       int n = nums.length;
       for(int i=0;i<n;i++){
            int val = nums[i];
            countMap.put(val, countMap.getOrDefault(val, 0) + 1); 
       }  
       List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());
       entryList.sort((a, b) -> b.getValue() - a.getValue());
       int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }
        return result;
    }
}
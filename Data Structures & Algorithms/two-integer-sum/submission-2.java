class Solution {
    public int[] twoSum(int[] nums, int target) {
        //optimized hashmap
       Map<Integer, Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (mpp.containsKey(c)) { //if already contains 
                return new int[] { mpp.get(c), i };
            }
            
            // Otherwise, put the value
            mpp.put(nums[i], i);
            }
        
        return new int[] {};
        
    }
}

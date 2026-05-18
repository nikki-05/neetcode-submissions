
class Solution {
    public int missingNumber(int[] nums) {
        int sum2=0;
        int n= nums.length;
        int sum = n * (n + 1) / 2;
        for(int i=0;i<n;i++){
         sum2 += nums[i];
        }
        return Math.abs(sum-sum2);

    }
}

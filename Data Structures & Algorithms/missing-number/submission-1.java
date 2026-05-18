
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR afrom 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR of the array elements
        for (int num : nums) {
            xor ^= num;
        }

        return xor;

    }
}

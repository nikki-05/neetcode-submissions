class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while (n > 0) {
            if (n % 2 == 1) {   // check last bit
                count++;
            }
            n = n / 2;          // shift right
        }

        return count;
    }
}

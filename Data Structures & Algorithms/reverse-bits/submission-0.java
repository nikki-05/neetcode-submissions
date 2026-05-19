class Solution {
    public int reverseBits(int n) {
         int reversed = 0;

        for (int i = 0; i < 32; i++) {
            // Get last bit
            int bit = n & 1;

            // Shift reversed left and add bit
            reversed = (reversed << 1) | bit;

            // Shift n right
            n >>>= 1;
        }

        return reversed;
        
    }
  
}

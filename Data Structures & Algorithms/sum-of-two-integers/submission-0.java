class Solution {
    public int getSum(int a, int b) {
        // for add operation we use shift left , AND, and XOR operations 
         while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
        
    }
}

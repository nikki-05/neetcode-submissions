class Solution {
    public int maxArea(int[] heights) {
       int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int current = Math.min(heights[left], heights[right]) * width;

            maxWater = Math.max(maxWater, current);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;  
    }
}

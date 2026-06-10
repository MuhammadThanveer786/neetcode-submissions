class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxWater = 0;
        while(left < right)
        {
            int wt = right - left;
            int ht = Math.min(heights[left],heights[right]);
            int currentWater = wt*ht;
            maxWater = Math.max(maxWater,currentWater);
            if(heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return maxWater;
    }
}

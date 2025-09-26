class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;  // To store the smallest window
        int i = 0;
        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum += nums[j];  // Expand the window to the right

            // Try shrinking from the left while sum is valid
            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i];  // Shrink from the left
                i++;
            }
        }

        // If no valid subarray was found, return 0
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
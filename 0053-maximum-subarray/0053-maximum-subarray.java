class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(i=1;i<nums.length;i++)
        {
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
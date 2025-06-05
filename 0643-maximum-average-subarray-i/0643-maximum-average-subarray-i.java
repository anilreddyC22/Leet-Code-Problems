class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sumAve=0;
        int l=0;
        int r=0;
        double maxAve = Double.NEGATIVE_INFINITY;
        while(r<nums.length){
            sumAve=sumAve+nums[r];

            if(r-l+1==k){
                double average=sumAve/k;
                maxAve=Math.max(maxAve,average);
                sumAve-=nums[l];
                l++;
            }
            r++;
        }
        return maxAve;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { 
        
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
            }
            else{
                curr=0;
            }
            if(max<curr){
                max=curr;
            }
        }
        return max;
    }
}
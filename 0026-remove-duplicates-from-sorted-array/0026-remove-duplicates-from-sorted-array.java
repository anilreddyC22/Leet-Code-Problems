class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            boolean isDuplicate=false;
            for (int j=0;j<k;j++)
            {
                if(nums[i]==nums[j])
                {   
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
}
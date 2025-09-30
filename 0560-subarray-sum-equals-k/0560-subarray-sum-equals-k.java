class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum=0;
        int count=0;
        int n = nums.length;
        // for(int start =0;start<nums.length;start++)
        // {
        //     int sum=0;
        //     for(int end=start;end<nums.length;end++)
        //     {
        //         sum+=nums[end];
        //         if(sum==k)
        //         {
        //             currSum+=1;
        //         }
        //     }
        // }

        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);

        for(int num : nums)
        {
            currSum+=num;
            if(prefixSum.containsKey(currSum-k))
            {
                count+=prefixSum.get(currSum-k);
            }
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        }


        return count;
    }
}
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Brute Force approach
        //int n=nums.length; 
        //for(int i=0;i<n-1;i++){
            //for(int j=i+1;j<n;j++){
                //if(nums[i]+nums[j]==target){
                    //return new int[] {i,j};
                //}
            //}

        //}
        
        Map<Integer,Integer> entry=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(entry.containsKey(complement)){
                return new int[]{entry.get(complement),i};
            }
            entry.put(nums[i],i);
        }

        return new int[]{};
        
    }
}
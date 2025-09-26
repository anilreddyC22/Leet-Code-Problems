class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left =0;
        int right =0;
        int subArrayCount =0;

        int sum=0;
        while(right < arr.length) 
        {
            sum=sum+arr[right]; // 2+2+2 s is 6  r is 2

            if(right-left+1==k) // 2-0+1==3
            {
                if(sum/k>=threshold)
                {
                    subArrayCount+=1;
                }
                sum=sum-arr[left];
                left++;
            }
            right++;
        }
        return subArrayCount;
        
    }
}
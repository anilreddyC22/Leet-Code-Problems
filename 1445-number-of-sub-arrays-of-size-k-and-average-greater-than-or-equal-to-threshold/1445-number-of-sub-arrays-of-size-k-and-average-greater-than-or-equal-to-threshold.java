class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int l=0;
        int r=0;
        //double maxAve= Double.NEGATIVE_INFINITY;
        int sum=0;
        while (r < arr.length){
            sum=sum+arr[r];
            if(r-l+1==k){
                double average=sum/k;
                if(average>=threshold)
                {
                    count++;
                }
                //maxAve=Math.max(maxAve,average);
                sum-=arr[l];
                l++;
            }
            
            r++;
        }
        return count;
        
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        //int k=0;
        //for(int i=0;i<n;i++)
        //{
            //boolean isDuplicate=false;
            //for (int j=0;j<k;j++)
            //{
                //if(nums[i]==nums[j])
                //{   
                    //isDuplicate=true;
                    //break;
                //}
            //}
            //if(!isDuplicate){
                //nums[k]=nums[i];
                //k++;
            //}
        //}

        int i=1; 
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }

        //Third approach
        //int count=0;
        //for (int i=0;i<n;i++){
            //if(i<n-1 && nums[i]==nums[i+1]){
                //continue;
            //}
            //else{
                //nums[count]=nums[i];
                //count++;
            //}
        //}
        return i;
        
    }
}
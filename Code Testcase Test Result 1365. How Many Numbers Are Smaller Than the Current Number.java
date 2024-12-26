class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int A[]=new int[nums.length];
        
        for(int i=0;i<=nums.length-1;i++){
            int count=0;//count in this for loop because always start count from 0.
            for(int j=0;j<=nums.length-1;j++){
                if(nums[j]<nums[i]){
                    count++;

                }

            }A[i]=count;
        }
        return A;
    }
}

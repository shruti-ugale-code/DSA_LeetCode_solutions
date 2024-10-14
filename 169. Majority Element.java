class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            int count=0;

            for(int j=0;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            } if(count>nums.length/2){
                return nums[i];
            }
        }
       return -1;
          
    }
}

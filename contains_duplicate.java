class Solution {
    public boolean containsDuplicate(int[] nums) {
        int sub = nums.length;
        Arrays.sort(nums);
        for(int i=0; i< sub-1; i++){
            
                if(nums[i]==nums[i+1]){
                    return true;
            }
        }
        return false;
    }
}

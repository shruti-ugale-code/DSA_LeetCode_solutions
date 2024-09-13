class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        int sub = nums.length-1;
        for(int i=0; i<= 2; i++){
            ans = ans*nums[sub-i];
        }
        int ansy = nums[0]*nums[1]*nums[sub];
        return Math.max(ans,ansy);
    }
}

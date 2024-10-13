class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;      // To track the current sequence of 1's
        int maxCount = 0;   // To track the maximum sequence of consecutive 1's

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;  // Increment the current count if we encounter a 1
            } else {
                // Reset count when a 0 is encountered and update maxCount
                maxCount = Math.max(maxCount, count);
                count = 0;  // Reset count to 0 as we hit a 0
            }
        }

        // Update maxCount in case the longest sequence is at the end of the array
        maxCount = Math.max(maxCount, count);

        return maxCount;
    }
}

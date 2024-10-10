class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] minLeft = new int[n];  // Array to store the minimum index from the left
        
        // Step 1: Fill minLeft array with indices of the smallest elements seen so far
        minLeft[0] = 0;  // Initialize with the first index
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minLeft[i - 1]]) {
                minLeft[i] = i;  // Update minimum index
            } else {
                minLeft[i] = minLeft[i - 1];  // Keep the previous minimum index
            }
        }
        
        // Step 2: Find the maximum width ramp by scanning from right to left
        int maxWidth = 0;
        for (int j = n - 1; j > 0; j--) {
            // Compare current j with the minimum index found in minLeft[j]
            while (j > minLeft[j] && nums[minLeft[j]] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - minLeft[j]);  // Update max width
                // Move to the left to see if there's a better ramp for the current j
                break;
            }
        }
        
        return maxWidth;

        
    }
}

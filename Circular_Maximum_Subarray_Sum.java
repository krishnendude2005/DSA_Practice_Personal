public class Circular_Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        // Either - GlobalMax
        // Or, Total - glbalMin

        int total = nums[0];

        int currMax = nums[0];
        int globalMax = nums[0];

        int currMin = nums[0];
        int globalMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // calculate the total sum
            total += nums[i];

            // Find Maximum
            currMax = Math.max(nums[i], currMax + nums[i]);
            globalMax = Math.max(globalMax, currMax);

            // Find Mininum
            currMin = Math.min(nums[i], currMin + nums[i]);
            globalMin = Math.min(currMin, globalMin);
        }

        // Now we have 2 options
        // Either - GlobalMax
        // Or, Total - glbalMin


        // CASE: 1
        // If the array is all negative, then we need to just return the globalMax
        // we do not need to calculate the ( total - globalMin )

        if (globalMax < 0) { // Means, we do not have any positive , all negatives
            return globalMax;
        }


        // CASE: 2
        return Math.max(globalMax, (total - globalMin));
    }
}

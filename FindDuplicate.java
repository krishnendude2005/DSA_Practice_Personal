public class FindDuplicate {
    public static void main(String[] args) {
        FindDuplicate solution = new FindDuplicate();
        int[] nums1 = {3,1,3,4,2};


        System.out.println(solution.findDuplicate(nums1)); // Output: 2

    }
    public int findDuplicate(int[] nums) {
        // Phase 1: Detect cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];           // move 1 step
            fast = nums[nums[fast]];     // move 2 steps
        } while (slow != fast);

        // Phase 2: Find cycle entrance (duplicate)
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // or fast, both are same
    }
}
//-------------

//Why do-while is Necessary Here
//
//At the start:
//
//int slow = nums[0];
//int fast = nums[0];
//
//
//slow and fast start at the same position.
//
//If we used a regular while (slow != fast), the loop would never run, because initially slow == fast.
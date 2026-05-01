class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;   // ✅ move both
            } 
            else if (nums[mid] == 1) {
                mid++;   // ✅ already correct
            } 
            else { // nums[mid] == 2
                // swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;  // ❗ don't move mid here
            }
        }
    }
}
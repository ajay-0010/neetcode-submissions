class Solution {
    public int removeDuplicates(int[] nums) {

        int low = 0;
        int high = 1;
        int count = 1;
        int k = 0;

        int[] temp = new int[nums.length];
        temp[k] = nums[0];
        k++;

        while (high < nums.length) {

            if (nums[low] != nums[high]) {
                temp[k] = nums[high];
                k++;
                count++;
                low = high;
            }

            high++;
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return count;
    }
}
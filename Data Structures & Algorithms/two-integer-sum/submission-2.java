class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int total = 0;
        int[] result = new int[2];
        while(low<high){
            total = nums[low]+nums[high];
            if(target==total){
                result[0] = low;
                result[1] = high;
                return result;
            }
            if(high == low+1){
                low++;
                high = nums.length;
            }
            high--;
        }
    return result;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int counter = 1;
        if(nums.length==1){
            return nums[0];
        }
        while(low<high){
            if(nums[low]==nums[high]){
                counter++;
                if(counter > (nums.length-1)/2){
                    return nums[low];
                }
                high--;
            }
            if(nums[low]!=nums[high] && high == low+1){
                high = nums.length-1;
                low++;
            }
            if(nums[low]!=nums[high]){
                high--;
            }
        }
    return 0;
    }
}
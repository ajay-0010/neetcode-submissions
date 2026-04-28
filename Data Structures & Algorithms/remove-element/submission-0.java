class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        // int size = 1;
        int result[] = new int[nums.length];
        int low = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                result[low] = nums[i];
                low++;
                // size++;
            }
            else{
                k--;
            }
        }
        for(int i = 0; i<result.length; i++){
            nums[i] = result[i];
        }
    return k;
    }
}
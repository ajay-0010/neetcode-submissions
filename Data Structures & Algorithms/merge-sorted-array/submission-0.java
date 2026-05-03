class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] comp = new int[m];

        for (int q = 0; q < m; q++) {
            comp[q] = nums1[q];
        }

        while (k < m + n) {

            if (i == comp.length) {
                nums1[k] = nums2[j];
                j++;
            } 
            else if (j == nums2.length) {
                nums1[k] = comp[i];
                i++;
            } 
            else if (comp[i] <= nums2[j]) {
                nums1[k] = comp[i];
                i++;
            } 
            else {
                nums1[k] = nums2[j];
                j++;
            }

            k++;
        }
    }
}
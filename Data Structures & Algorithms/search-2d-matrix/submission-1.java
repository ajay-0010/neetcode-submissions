class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = matrix.length;
        int m = matrix[0].length;
        int p = 0;
        int q = m-1;
        while(p<l && q >=0){
            if(matrix[p][q] > target){
                q--;
            } else if(matrix[p][q] < target){
                p++;
            } else {
                return true;
            }
        }
        return false;
    }
}

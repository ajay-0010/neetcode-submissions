class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int low = 0;
        int high = strs.length - 1;
        int index = 0;
        if(strs.length == 1){
            result = strs[0];
        }
        if (strs == null || strs.length == 0) {
            return "";
        }

        if (index >= strs[low].length() || index >= strs[high].length() ||
            strs[low].charAt(index) != strs[high].charAt(index)) {
            result = "";
        }

        while (low < high) {

            if (index >= strs[low].length() || index >= strs[high].length()) {
                break;
            }

            if (strs[low].charAt(index) == strs[high].charAt(index)) {
                high--;
            }

            if (index < strs[low].length() && index < strs[high].length() &&
                strs[low].charAt(index) == strs[high].charAt(index) &&
                high == low + 1) {

                result += strs[low].charAt(index);
                index++;
                high = strs.length - 1;
            }

            if (index >= strs[low].length() || index >= strs[high].length() ||
                strs[low].charAt(index) != strs[high].charAt(index)) {
                break;
            }
        }

        return result;
    }
}
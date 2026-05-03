class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");

        int low = 0;
        int high = s.length() - 1;

        while (low < high) {

            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
                continue;
            }

            if (s.charAt(low) != s.charAt(high)) {
                return false; // ❗ important fix
            }

            low++;
            high--;
        }

        return true;
    }
}
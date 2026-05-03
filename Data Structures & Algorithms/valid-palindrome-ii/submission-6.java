class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();

        int low = 0;
        int high = s.length() - 1;
        int count = 0;

        while (low < high) {

            if (s.charAt(low) != s.charAt(high)) {

                if (count == 1) {
                    return false;
                }

                // try skipping left
                int l1 = low + 1;
                int h1 = high;
                boolean skipLeft = true;

                while (l1 < h1) {
                    if (s.charAt(l1) != s.charAt(h1)) {
                        skipLeft = false;
                        break;
                    }
                    l1++;
                    h1--;
                }

                // try skipping right
                int l2 = low;
                int h2 = high - 1;
                boolean skipRight = true;

                while (l2 < h2) {
                    if (s.charAt(l2) != s.charAt(h2)) {
                        skipRight = false;
                        break;
                    }
                    l2++;
                    h2--;
                }

                return skipLeft || skipRight;
            }

            low++;
            high--;
        }

        return true;
    }
}
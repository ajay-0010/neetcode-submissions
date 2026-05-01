class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int maxKey = 0;
            int maxFreq = 0;

            for (Integer key : map.keySet()) {
                int freq = map.get(key);

                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxKey = key;
                }
            }

            result[i] = maxKey;

            map.remove(maxKey);
        }

        return result;
    }
}
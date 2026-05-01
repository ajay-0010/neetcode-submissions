class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < strs.length; i++) {

            String word = strs[i];

            char[] arr = word.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if (map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(word);
                map.put(key, list);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
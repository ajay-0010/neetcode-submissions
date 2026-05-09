class MyHashMap {

    private int size = 1000;
    private java.util.LinkedList<int[]>[] buckets;

    // Constructor
    public MyHashMap() {
        buckets = new java.util.LinkedList[size];

        for (int i = 0; i < size; i++) {
            buckets[i] = new java.util.LinkedList<int[]>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Put key-value
    public void put(int key, int value) {
        int index = hash(key);
        java.util.LinkedList<int[]> bucket = buckets[index];

        // check if key exists → update
        for (int i = 0; i < bucket.size(); i++) {
            int[] pair = bucket.get(i);

            if (pair[0] == key) {
                pair[1] = value; // update value
                return;
            }
        }

        // if not found → add new pair
        bucket.add(new int[]{key, value});
    }

    // Get value
    public int get(int key) {
        int index = hash(key);
        java.util.LinkedList<int[]> bucket = buckets[index];

        for (int i = 0; i < bucket.size(); i++) {
            int[] pair = bucket.get(i);

            if (pair[0] == key) {
                return pair[1];
            }
        }

        return -1;
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);
        java.util.LinkedList<int[]> bucket = buckets[index];

        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i)[0] == key) {
                bucket.remove(i);
                return;
            }
        }
    }
}
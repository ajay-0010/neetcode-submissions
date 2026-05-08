class MyHashSet {

    private int size = 1000; // number of buckets
    private java.util.LinkedList<Integer>[] buckets;

    // Constructor
    public MyHashSet() {
        buckets = new java.util.LinkedList[size];

        for (int i = 0; i < size; i++) {
            buckets[i] = new java.util.LinkedList<Integer>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % size;
    }

    // Add key
    public void add(int key) {
        int index = hash(key);

        java.util.LinkedList<Integer> bucket = buckets[index];

        // check if already exists
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i) == key) {
                return;
            }
        }

        bucket.add(key);
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);

        java.util.LinkedList<Integer> bucket = buckets[index];

        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i) == key) {
                bucket.remove(i);
                return;
            }
        }
    }

    // Contains key
    public boolean contains(int key) {
        int index = hash(key);

        java.util.LinkedList<Integer> bucket = buckets[index];

        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i) == key) {
                return true;
            }
        }

        return false;
    }
}
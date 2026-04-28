class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = new char[s.length()];
        char[] b = new char[t.length()];
        if(s.length()!=t.length()){
            return false;
        }
        a = s.toCharArray();
        b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
    return true;
    }
}

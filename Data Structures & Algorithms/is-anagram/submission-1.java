class Solution {
    private String sortString(String s){
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String res = new String(charArr);
        return res;
    }
    public boolean isAnagram(String s, String t) {
        String s1 = sortString(s);
        String s2 = sortString(t);
        return s1.equals(s2);
    }
}

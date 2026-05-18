class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String str : strs){
            int chr[] = new int[26];
            for(char ch : str.toCharArray()){
                chr[ch-'a']++;
            }
            String st = Arrays.toString(chr);
            mpp.putIfAbsent(st, new ArrayList());
            mpp.get(st).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}

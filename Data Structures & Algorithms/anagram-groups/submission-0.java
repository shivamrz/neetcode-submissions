class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp =new HashMap<>();

        for(String s : strs){
            int cnt[] = new int[26];
            for(char ch:s.toCharArray()){
                cnt[ch-'a']++;
            }
            String sb = Arrays.toString(cnt);
            mpp.putIfAbsent(sb, new ArrayList<>());
            mpp.get(sb).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}

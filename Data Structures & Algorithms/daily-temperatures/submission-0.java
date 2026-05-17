class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        int prevIdx=0;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                prevIdx=st.pop();
                res[prevIdx]=i-prevIdx;
            }
            st.push(i);
        }
        return res;
    }
}
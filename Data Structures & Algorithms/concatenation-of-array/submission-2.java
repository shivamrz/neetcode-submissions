class Solution {
    public int[] getConcatenation(int[] nums) {
        int newArr[] = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            newArr[i]=nums[i];
            newArr[nums.length+i]=nums[i];
        }
        return newArr;
    }
}
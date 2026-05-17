class Solution {
    public void rotate(int[] nums, int k) {
        int nums1[]=new int[nums.length];
        nums1=nums.clone();
        for(int i=0; i<nums.length; i++){
            nums[(i+k)%nums.length]=nums1[i];
        }
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int [n+n];
        for(int i=0;i<n;i++){
            arr[i+nums.length]=arr[i]=nums[i];
        }
        return arr;
    }
}
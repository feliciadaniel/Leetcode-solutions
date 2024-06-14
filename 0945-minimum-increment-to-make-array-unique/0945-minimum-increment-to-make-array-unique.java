class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int increment=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                int difference = nums[i-1]-nums[i]+1;
                nums[i] += difference;
                increment+=difference;

            }
        }
        return increment;
    }
}
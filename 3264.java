class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0) {
            int index = 0;
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] < nums[index]) {
                    index = i;
                }
            }
            nums[index] *= multiplier;
        }
        return nums;
    }
}

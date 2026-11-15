class Solution {
    public int missingNumber(int[] nums) {
        int expected_sum = 0;
        int actual_sum = 0;
        for(int i =0 ;i<= nums.length;i++) {
             expected_sum += i;
        }
        for(int i=0 ; i<nums.length;i++) {
             actual_sum += nums[i];
        }
        return expected_sum-actual_sum;
    }
}
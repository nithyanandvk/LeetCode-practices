class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            sum += nums[n - 1];
            nums[n - 1] = nums[n - 1] + 1;
        }
        return sum;
    }
}
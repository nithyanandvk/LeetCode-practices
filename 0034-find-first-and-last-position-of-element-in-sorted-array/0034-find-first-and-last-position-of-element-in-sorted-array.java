class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                a[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == target) {
                a[1] = i;
                break;
            }
        }
        if (a[0] == 0) {
            if (nums.length != 0 && nums[0] != target) {
                a[0] = -1;
            }

        }
        if (a[1] == 0) {
            if (nums.length != 0 && nums[0] != target) {
                a[1] = -1;
            }

        }
        if(nums.length==0){
            a[0]=a[1]=-1;
        }
        return a;
    }
}
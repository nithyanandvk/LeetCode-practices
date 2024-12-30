class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(nums[i]);
        }
        HashSet<Integer> b;
        int c = 0;
        while (true) {
            b = new HashSet<>(a);
            if (a.size() != b.size()) {
                ++c;
                if (a.size() >= 3) {
                    a.remove(0);
                    a.remove(0);
                    a.remove(0);
                } else {
                    a.clear();
                }
            } else {
                break;
            }
        }
        return c;
    }
}
class Solution {
    public int maxScore(String s) {
        int left = 0, right = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                right++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                left++;
            } else {
                right--;
            }
            max = Math.max(max, left + right);
        }
        return max;
    }
}

import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        ArrayList<BigInteger> a = new ArrayList<>();
        for (String num : nums) {
            a.add(new BigInteger(num));
        }
        Collections.sort(a);
        return a.get(a.size() - k).toString();
    }
}

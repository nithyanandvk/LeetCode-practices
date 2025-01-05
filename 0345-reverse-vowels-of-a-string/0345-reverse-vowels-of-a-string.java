class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;
        char c[] = s.toCharArray();
        while (l < r) {
            while (l < r && !isVowel(c[l])) {
                l++;
            }
            while (l < r && !isVowel(c[r])) {
                r--;
            }
            if (l < r) {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
        }
        return new String(c);
    }

    boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}

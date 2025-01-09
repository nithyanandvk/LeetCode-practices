class Solution {
    public int[] beautifulArray(int n) {
        int a[] = new int[n];
        if (n == 1) {
            a[0] = 1;
            return a;
        }
        int l[] = beautifulArray((n + 1) / 2);
        int r[] = beautifulArray(n / 2);
        for (int i = 0; i < l.length; i++) {
            a[i] = l[i] * 2 - 1;
        }
        for (int i = l.length; i < n; i++) {
            a[i] = r[i - l.length] * 2;
        }
        return a;
    }
}
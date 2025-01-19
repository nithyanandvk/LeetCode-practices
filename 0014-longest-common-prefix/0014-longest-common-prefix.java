class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs[0].length();
        int m=strs.length;
        String prefix="";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(strs[j].length()<=i || strs[j].charAt(i)!=strs[0].charAt(i)){
                    return prefix;
                }
            }
            prefix=prefix+strs[0].charAt(i);
        }
        return prefix;
    }
}
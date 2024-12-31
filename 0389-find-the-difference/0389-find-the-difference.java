class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch1=t.charAt(i);
            arr[ch1-'a']--;
        }    
        char ch2='\0';
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
               ch2=(char)(i+'a');
            }
        }
        return ch2;            
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,rem;
        int temp=x;
        while(x>0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;

        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)) return false;
        int revNum = 0 , temp=x;
        while(temp!=0){
           int revDigit = temp%10;
           revNum = revNum*10 + revDigit;
           temp /= 10; 
        }
        if(revNum==x || x==0) return true;
        else return false;
    }
}
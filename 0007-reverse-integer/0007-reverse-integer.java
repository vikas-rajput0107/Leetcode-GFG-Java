class Solution {
    public int reverse(int x) {
      long revNum = 0;
        while(x!=0){
           int revDigit = x%10;
            revNum= revNum * 10 +revDigit;
            x/=10;
        }
       if(revNum<=2147483647 && revNum>=-2147483648) return (int)revNum;
       else return 0;
    }
}
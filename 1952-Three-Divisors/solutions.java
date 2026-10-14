class Solution {
    public boolean isThree(int n) {
        int count = 0 ;                                       // decrleration of cout
        for (int i = 1; i <= n; i++) if(n%i == 0) count++;   //Checks Divisors and increses the count by one 
        if(count==3)return true;                             // return's true if count == 3 
        else return false;
    }
}
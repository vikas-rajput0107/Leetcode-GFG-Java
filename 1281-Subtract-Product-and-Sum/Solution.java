// Time Complexity: O(log N)
// Space Complexity: O(1)

class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0;           
        int product = 1;
        // Loop through each digit of the number
        for(int digit = 0 ; n!=0 ; n/=10){
            digit = n%10;                    // Extract the last digit
            sum += digit;                    // Add to sum
            product *= digit;                // Multiply to product

        }
       return product-sum;
    }
}
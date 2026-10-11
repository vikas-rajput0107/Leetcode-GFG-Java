class Solution {
    public int countPrimes(int n) {
       int total_prime_numbers = 0;
            int[] primeArray = new int[n];
            for(int i=2 ; i<n ; i++) primeArray[i] = 1;
            for(int k = 2 ; k<(Math.sqrt(n)) ; k++){
                if(primeArray[k] == 1){
                    for(int j = k*k ; j<n ; j+=k) primeArray[j] = 0;
                }
            }
            for(int g = 2 ; g<n ; g++) {
                if(primeArray[g] == 1) total_prime_numbers++;
            }
            return total_prime_numbers;
        }  
    }
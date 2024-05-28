//   https://www.geeksforgeeks.org/problems/perfect-numbers3207/1


// solution -1 

class PerfectNumber {
    static int isPerfectNumber(long n) {
        long value = 0;
        for ( int i = 1; i <= n/2; i++){
            if (n % i == 0)
                value = value + i;
        }
        if (value == n)
                return 1;
            
            else 
                return 0;
            
    }
};


// solution - 2



class PerfectNumber {
    static int isPerfectNumber(long n) {
       
        long factor = 0;
        for (int i = 1; i< Math.sqrt(n); i++){
            if (n % i == 0 ){
                factor += i;
                if ( n / i != n){
                factor += n / i;
                }
            }
        }
        
        if (factor == n)
                return 1;
            
            else 
                return 0;
        }     
    
};

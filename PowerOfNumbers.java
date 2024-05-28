// https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1



class PowerOfNumbers
{
        
    long power(int N,int R)
    
    
    {long n = (long)N,r= (long)R;
        long mod = 1000000007;
        long value = 1;
        while ( r > 1){
        if ( r % 2 != 0 ){
            value = (( value % mod ) * ( n % mod ))%mod;
        }
        n = (( n % mod ) * ( n % mod ))%mod;
        r = r / 2;
        }
        return( n * value) % mod;
    }

}

// https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1



solution - 1 (O(n))

class Gcd {
    public static int gcd(int a, int b) {
    
        int smallValue = (a < b ) ? a : b;
        for ( int i = smallValue; i > 0; i-- ){
            if ( a % i == 0 && b % i == 0){
               return i;
              
            }
        }
    return 1;
    }
}


solution-2 - O(log(min(a, b)))


class Gcd {
    public static int gcd(int a, int b) {
 
          
             while(b != 0){
                
            int  reminder = a % b;
            if(reminder == 0){
                return b;
            }
             a = b;
            b = reminder;
            
           
           
            }
            return b;
    }
}

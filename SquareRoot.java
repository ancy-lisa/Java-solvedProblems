//   https://www.geeksforgeeks.org/problems/square-root/1

// solution -1 

class SquareRoot
{
     long floorSqrt(long x)
	 {
	     int a =0;
	     int value = 1;
	     if ( x == 1){
	         return 1;
	     }
	     for(int i = 1; i <= x/2; i++){
	      value = i*i;
	      a = i;
	      if ( x == value ){
	        return i; 
	     }
	     else if ( value > x ){
	         return i-1;
	     }
	     }
	     return a;
	 }
}


// solution -2 


class SquareRoot
{
     long floorSqrt(long x)
	 {

	     int value = 1;
	     for(int i = 1; i <= (x/2)+1; i++){
	      value = i*i;
	     
	      if ( x == value ){
	        return i; 
	     }
	     else if ( value > x ){
	         return i-1;
	     }
	     
	     }
	     return 1;
	 }
}

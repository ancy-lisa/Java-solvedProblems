//  https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1


class MinMaxArray 
{
    static Pair getMinMax(long a[], long n)  
    {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
       for ( int i = 0; i < a.length; i++){
           if (a[i] > max){
               max = a[i];
           }
           if (a[i] < min){
               min = a[i];
           }
           
       }
       Pair pair = new Pair(min, max);
         return pair;
    }
}

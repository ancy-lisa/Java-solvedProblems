//   https://www.geeksforgeeks.org/problems/third-largest-element/1



class ThirdLargest
{
    int thirdLargest(int a[], int n)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
	   for(int i = 0; i < a.length; i++){
	       if (a[i] > first){
	           third = second;
	           second = first;
	           first = a[i];
	           continue;
	       }
	       if ( a[i] > second ){
	           third = second;
	           second = a[i];
	          continue;

	       }
	       if ( a[i] > third){
	           third = a [i];
	       }
	   }
	   return third;
    }
}


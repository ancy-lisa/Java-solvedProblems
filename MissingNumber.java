//  https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1




class MissingNumber {
    int missingNumber(int array[], int n) {
        int[] arr = new int[n+1];
        
        for ( int i = 0; i < n-1; i++){
                arr[array[i]] = 1;
        }
         for ( int i = 1; i < arr.length; i++){
              if (arr[i] == 0){
                  return i;
              }
        }
        return 1;
    }
}

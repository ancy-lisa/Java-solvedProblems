//   https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1




// solution = 1 


class RotateAnArrayByD {
    static void rotateArr(int arr[], int d, int n) {
        for( int j = 0; j < d % n ;j++){
        int temp = arr[0];
        for (int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        }
        
    }
}




//   solution - 2 



class RotateAnArrayByD {
    static void rotateArr(int arr[], int d, int n) {
        d = d % n;
        reverse (arr, 0 , d - 1);
        reverse (arr, d , n - 1);
        reverse (arr, 0 , n - 1);
    }
    
    
    
    static void reverse (int arr[], int i, int j){
        while (i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}

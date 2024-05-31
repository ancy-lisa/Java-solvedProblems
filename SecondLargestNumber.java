// https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&sortBy=submissions




class SecondLargestNumber {
    int print2largest(int arr[], int n) {
        
        int firstValue = 0;
        int secondValue = 0;
        for ( int i = 0; i < arr.length; i++){
            if ( arr[i] > firstValue){
                secondValue = firstValue;
                firstValue = arr[i];
            }
            if (arr[i] < firstValue && arr[i] > secondValue){
                secondValue = arr[i];
            }
        }
        if (secondValue == 0){
            return -1;
        }
        return secondValue;
    }
}

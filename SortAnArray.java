//   https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article




class SortAnArray
{
    public static void sort012(int a[], int n)
    {
       int count_0 = 0;
       int count_1 = 0;
       int count_2 = 0;
       
       for ( int i = 0; i < a.length; i++){
           if(a[i] == 0){
               count_0++;
           }
            if(a[i] == 1){
               count_1++;
           }
            if(a[i] == 2){
               count_2++;
           }
            
       }
       for ( int j = 0; j < count_0; j++){
           a[j]= 0;
       }
       for ( int k = count_0; k < count_0+count_1; k++){
           a[k] = 1;
       }
       for (int l = count_0+count_1; l < n; l++){
           a [l] = 2;
       }
    }
}

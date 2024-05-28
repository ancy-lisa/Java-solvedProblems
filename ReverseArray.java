// reverse an array

// solution - 1
public class ReverseArray
{
  public static void main (String[]args)
  {
    int[] array = {1,2,3,4,5};
    int[] reverseArray = new int[array.length];
	    for (int i = array.length-1; i>=0; i--){
		reverseArray[(array.length-1) - i] = array[i];
	    } 
	    for (int i = 0; i < reverseArray.length; i++){
	    System.out.println(reverseArray[i]);
	    }
   }
}
    
    
// solution -2 

public class ReverseArray
{
  public static void main (String[] args)
  {
    int[] array = {1,2,3,4,5};
   int i = 0;
   int j = array.length-1;
    while (i<j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
    for (int k = 0; k < array.length; k++) {
        System.out.println(array[k]);
    }
    
  }
}
    


// solution -3 



public class ReverseArray
{
  public static void main (String[] args)
  {
    int[] array = {1,2,3,4,5};

        for (int i = 0,j =array.length-1; i < array.length/2; i++,j--){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        }
    for (int k = 0; k < array.length; k++) {
        System.out.println(array[k]);
    }
    
  }
}

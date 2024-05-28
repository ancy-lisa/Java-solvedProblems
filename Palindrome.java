//  https://www.geeksforgeeks.org/problems/palindrome0746/1




// solution = 1 


class Palindrome
{
    public String is_palindrome(int n)
    {
         String value ="";
         String nInString = Integer.toString(n);
         while ( n > 0 ){
           int lastDigit = n % 10;
           value = value + Integer.toString(lastDigit);
            n = n / 10;
        }
    
        if(value.equals(nInString)){
            return "Yes";
        }
        else {
            return "No";
        }
    }
}



// solution = 2 



class Palindrome
{
    public String is_palindrome(int n)
    {
        int value = 0;
        int initialValue = n;
         while ( n > 0 ){
           int lastDigit = n % 10;
            value = value * 10 + lastDigit;
            n = n / 10;
        }
    
        if(value == initialValue){
            return "Yes";
        }
        else {
            return "No";
        }
    }
}

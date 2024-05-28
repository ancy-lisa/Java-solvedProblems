// https://www.geeksforgeeks.org/problems/reverse-digit0316/1


class Reverse
{
    public long reverse_digit(long n)
    {
        String digitInReverse ="";
        while (n != 0){
             long digit = n % 10;
             digitInReverse += digit;
             
             n/=10;
        }
        long reverseValue = Long.parseLong(digitInReverse);
        return reverseValue;   
    }
    
}

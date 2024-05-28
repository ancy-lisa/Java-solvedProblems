// https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1




class ArmstrongNumber {
    static String armstrongNumber(int n){
        int value = 0;
        int temp = n;
       while ( n > 0 ){
       int lastDigit = n % 10;
         lastDigit = lastDigit*lastDigit*lastDigit;
         value = value + lastDigit;
         n = n / 10;
       }
       return  value == temp ? "Yes": "No";
    }
}

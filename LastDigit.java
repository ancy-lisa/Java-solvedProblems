// https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1



class LastDigit {
    static int getLastDigit(String a, String b) {
      
       if (b.length() == 1 && b.equals("0")){
           return 1;
       }
       if (a.equals("1")){
           return 1;
       }
    
             int expoValue = powerValue(b,4) == 0 ? 4 : powerValue(b,4);
             int base = a.charAt(a.length() - 1) - '0';
             int totalExponential = (int)Math.pow(base, expoValue);
                return totalExponential % 10;

        
      
    }
   
   public static int powerValue(String b, int c){
         int result = 0;
       for(int i=0; i < b.length(); i++){
           result = ( result * 10 + b.charAt(i) - '0') % 4;
           
       }
       return result;
    }
};

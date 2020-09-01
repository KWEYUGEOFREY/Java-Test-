/*
1.calculate the sum of n numbers using formula
totalSum = n*(n+1)/2.

ii)Add the numbers of an array and subtract it from the sum of numbers.
*/

public class MissingNumber {
 
  public static void main(String[] args) {
 
        int[] k = {3,5,4,1};
        
        /*
          One number is missing, so n is array length plus 1
        */
        int n = k.length + 1;
        
        //Calculating sum
        int sum = (n * (n+1))/2;
 
        /*
          Loop through array and subtracting each element from the sum 
         */
        for(int i = 0; i < k.length; i++) {
            sum = sum - k[i];
        }
 
        System.out.println( " Missing number is " + sum);
  }
  
 
}

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
          Traversing an array and subtracting each element with
          the sum 
         */
        for(int i = 0; i < k.length; i++) {
            sum = sum - arr[i];
        }
 
        System.out.println( " Missing number is " + sum);
  }
  
 
}
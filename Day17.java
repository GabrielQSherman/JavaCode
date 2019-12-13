import java.util.*;
import java.io.*;

//i created this class to take in two ints
class Calculator {

    //if the ints are less than 0 it will return true on the first condtional and throw a new 'Exception' 
    public int power(int n, int p) throws Exception { //you must state that this method has the posibility to throw an exception
        
        if (n < 0 || p < 0) {
            
            throw new Exception("n and p should be non-negative"); //this string can be logged to the console with e.geMessage 'e' is the short code given to exception in the catch conditional
            
        } else {
            
            return (int) Math.pow(n,p);
        }
        
    }

}

class Solution {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //the first int scanned will be the number of test done
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                //this code will be run and only stopped if there is an error excetption
                int ans = myCalculator.power(n, p);
                //the error will most likely occur before line 39 is ever encountered
                System.out.println(ans);
            }
            catch (Exception e) {
                //prints the error message
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

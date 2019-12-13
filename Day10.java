import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // String binaryStr = "";
        int conOnes = 0;
        int maxOnes = 0;

        //n must be at least one for there to be a remainder after n is divided by two
        while (n > 0) {
            
            //the remainder of n modulo two will be the added to the total binary number
            int remain = (n % 2);
            
            n = n / 2;
            
            System.out.print(remain);
                
                //one int handles how many consecutive ones there are currently, this will be reset every time the remainder is 0,
                //the 'maxOnes' stores the highest number that 'conOnes' has been
                if (remain == 1) {
                    
                    conOnes++;
                    
                    if (conOnes > maxOnes) {
                        
                        maxOnes = conOnes;
                        
                    } 
                
                } else {
                        
                        conOnes = 0;
                }
        } 
        //the binary number is printed one number at a time and the number of consecutive ones is printed after the number has been fully converted
        System.out.println(" --- Num of con ones: " + maxOnes);

        scanner.close();
    }
}

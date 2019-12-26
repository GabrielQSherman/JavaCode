import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    
    public static String isPrime(int num) {
        for (int i = 2; i < num - 1; i++) { //this insures that one and the number itself are not counted. the sqrt of the number would be a better number to end with
            if (num % i == 0) { //logic that finds a non-prime number
                return "Not Prime"; //the loop will end if at any point the number is proven that a number other than one and itself can divide it
            }
        } 
        return "Prime"; //if it makes it through the whole loop than it must be prime
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        while (num > 0) {
            System.out.println(isPrime(num));
            
            num = sc.nextInt();
        }
        
    }
}

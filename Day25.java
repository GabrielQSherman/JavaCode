import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    
    public static String isPrime(int num) {
        return "The number " + num;
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




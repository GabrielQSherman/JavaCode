import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("row: " + i);
            
            for (int j = 0; j < 4; j++) {
                
                // System.out.print(" | column: " + j);
                // System.out.print(" | top row : " + arr[i][j] + arr[i][j+1] + arr[i][j+2]);
                
                
                 int topRow = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                 
                //  System.out.print(" | top row : " + arr[i][j] + arr[i][j+1] + arr[i][j+2] + " Middle Data: " + arr[i + 1][j + 1] + " Bottom Row: " + arr[i + 2][j] + arr[i + 2][j+1] + arr[i + 2][j+2] );
                
                System.out.println("Hour Glass: \n" + arr[i][j] + arr[i][j+1] + arr[i][j+2] + "\n " + arr[i + 1][j + 1] + "\n" + arr[i + 2][j] + arr[i + 2][j+1] + arr[i + 2][j+2]);
                
            } 
            System.out.println();
        } 

        scanner.close();
    }
}

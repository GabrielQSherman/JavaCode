import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        
        //this int will be used to store the greatest HourGlassTotal yet found when iterating through the possible hourglasses of the array;
        int GHT = 0;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        
        for (int i = 0; i < arr.length - 2; i++) {
            
            
            for (int j = 0; j < arr[i].length - 2; j++) {
             
                 int topRow = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                 
                 int middle = arr[i + 1][j + 1];
                 
                 int bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                 
                 int HourGlassTotal = (topRow + middle + bottom);
                 
                //  System.out.println("HourGlassTotal = " + HourGlassTotal);
                //  System.out.println();
                 
                 if (HourGlassTotal > GHT) {
                     GHT = HourGlassTotal;
                 }
                 
                 
            } 
            
        } 
        
        System.out.println(GHT);

        scanner.close();
    }
}

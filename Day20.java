import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// challenge was on how to create a bubble sort algorithm in Java

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
       //I created this variable just beofore my sorting alg begins to keep track of the total number of swaps that occur
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {

            //the for loop will itterate a maximum of the number of elements in our given array
            //the loop will be stopped if you can start at one number in the array and itterate through each number proceeding -
            //- without finding one number pair in decressing order

            int currNumberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                //a nested loop is created to do a complete check on the array to see if any numbers next to eachother are in decending order
                if (a[j] > a[j + 1]) { //if so...

                    //a temporary int var is created to store the value of a number (could be either one a[j] or a[j+1])
                    int temp = a[j + 1];

                    a[j+1] = a[j];
                    a[j] = temp;

                    currNumberOfSwaps++; //then the number of swaps are incressed
                    totalSwaps++; //the 'curr' int will be used to check if on this itteration of the array if there have been any swaps
                    //the totalSwaps int var has a larger scope so it will keep track of the total number of swaps durring the entire alg
                }

            } 

            if (currNumberOfSwaps == 0) { //this will let us know that the array is sorted bc if no swaps have been done on a particular itteration that it must have been in accending order
                break;
            }


        }

        System.out.println("Array is sorted in " + totalSwaps + "swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

        
    }
}


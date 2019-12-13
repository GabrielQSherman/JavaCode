import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double mealC = scanner.nextDouble();
        int tipPer = scanner.nextInt();
        int taxPer = scanner.nextInt();

        scanner.close();

        double tip = mealC * (tipPer / 100);
        double tax = mealC * (taxPer / 100);

        int mealTotal = (int) Math.round(mealC + tip + tax);

        System.out.println(mealTotal);

    }    
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       int[] returnedDate = new int[3];
      
    //   List<Integer>   = new ArrayList<Integer>();
       for (int i = 0; i < 3; i++) {
        // returnedDate.add(scan.nextInt());
        returnedDate[i] = scan.nextInt();
       }
        
         int[] lateDate = new int[3];
    //   List<Integer> lateDate = new ArrayList<Integer>();
       for (int i = 0; i < 3; i++) {
        // lateDate.add(scan.nextInt());
        lateDate[i] = scan.nextInt();
       }
       
       int days = (returnedDate[0] - lateDate[0]);
       int months = (returnedDate[1] - lateDate[1]);
       int years = (returnedDate[2] - lateDate[2]);
       
       
       if (years > 0){
           System.out.println("10000");
           return;
       } else if (years < 0) {
           System.out.println("0");
           return;
       } else {
           if (months > 0) {
               System.out.println(months * 500);
               return;
           } else if (days > 0) {
               System.out.println(days * 15);
               return;
           } else {
               System.out.println("0");
               return;
           }
       }

    }
    
}


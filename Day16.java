import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//This problem involved catching errors and running the 'catch' code block if a specific error was thrown
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        //this program simply takes in a string and if it can not be parsed into an integer it throws and error 'NumberFormatException' when the catch conditional 'catches' this error it prints out bad string, and does not run the remaining code in the 'try' code block
    
        try {
            int num = Integer.parseInt(S);
            System.out.println(num);
        } catch (NumberFormatException e) {
            //runs this code if there are any non decimal characters in 'S'
            System.out.println("Bad String");
        }
    }
}


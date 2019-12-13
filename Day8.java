//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            
            phoneBook.put(name, phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            
            
            if (phoneBook.containsKey(s)) {
                //this variable could be omitted and .get() could be put inside of the println
                int phoneNum = phoneBook.get(s);
                
                System.out.println(s + "=" + phoneNum);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}


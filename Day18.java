import java.io.*;
import java.util.*;

// For this program i first created private variable. one for my stack and one for my queue
// stacks are like a physical stack of papers that you cant flip over.
// if you keep addeing to the top of the stack you must remove each 'top' item and remove every item from the top one at a time.
// to get to the first item placed in the stack you must remove every element to get there.
// queues are much diffrent in that it works like a line at the DMV the first person to arrive will be the first person seen.
// if you were to arrive late in the day, every person who got there before you will be taken care of before you are. this is common sense in thre real world, but must be strictly defined in programs.

// after creating my variable i was to make methods as a part of the Solution class.
// in javascript these methods are inherited when you create and array variable. but i had to make methods that could be called as a part of the class.
// an array in javascript uses the methods of push and pop but we are also given other methods like splice and slice.
// the queue characters are not familiar to me but i have a good understanding of them now.

    public class Solution {
        private LinkedList stack;
        private LinkedList queue;
    
        public Solution() {
            this.stack = new LinkedList();
            this.queue = new LinkedList();
        }
    
        private char popCharacter() {
            return (char) this.stack.pop();
        }
    
        private void pushCharacter(char c) {
            this.stack.push(c);
        }
    
        private char dequeueCharacter() {
            return (char) this.queue.remove(0);
        }
    
        private void enqueueCharacter(char c) {
            this.queue.addLast(c);
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
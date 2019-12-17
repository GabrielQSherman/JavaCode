import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

    //AA was the first to declare divisorSum but the Calculator class was the first to implement and define the method

    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        //after it is done checking for divisors and adding their value to sum, sum is the return value
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        //you must call the interface appended onto the name of your class instance
        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
                                            //this is one way to get the name of the interface a class uses
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        //prints returned value
        System.out.println(sum);
    }
}

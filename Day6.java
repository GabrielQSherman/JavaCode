import java.io.*;
import java.util.*;

// public class Person {
//     private int age;	

	
//     public Person(int initialAge) {
//         if (initialAge > 0) {
//             age = initialAge;
//         } else {
//             System.out.println("Age is not valid, setting age to 0.");
//             age = 0;
//         }
//     }

//     public void amIOld() {
//         // Write code determining if this person's age is old and print the correct statement:
//         if (age < 13) {
//             System.out.println("You are young.");
//         } else if (age < 18) {
//             System.out.println("You are a teenager.");
//         } else {
//             System.out.println("You are old.");
//         }
//     }

//     public void yearPasses() {
//         age++;
//     }


// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int T = sc.nextInt();
// 		for (int i = 0; i < T; i++) {
// 			int age = sc.nextInt();
// 			Person p = new Person(age);
// 			p.amIOld();
// 			for (int j = 0; j < 3; j++) {
// 				p.yearPasses();
// 			}
// 			p.amIOld();
// 			System.out.println();
//         }
// 		sc.close();
//     }
// }

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < T; i++) {
            String inStr = sc.nextLine();
            
            // System.out.println(inStr);
            
            String evnStr = "";
            String oddStr = "";

            for (int j = 0; j < inStr.length(); j++) {
                if (j % 2 == 0) {
                    evnStr += inStr.charAt(j);
                } else {
                    oddStr += inStr.charAt(j);
                }
            }

            System.out.println(evnStr + " " + oddStr);
            
        }
        
        
        sc.close();

    }
}


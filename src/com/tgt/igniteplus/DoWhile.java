/*A program that asks the user to enter two numbers.
 The numbers should be added and the sum displayed.
 The loop should ask the user whether he or she wishes to perform the operation again.
  If so, the loop should repeat; otherwise it should terminate.
 */

package com.tgt.igniteplus;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Boolean choice;

        do{
            System.out.println("Enter the two numbers");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("Sum of " + num1 + " and " + num2 + " is = " + (num1 + num2));
            System.out.println();
            System.out.println("Do you want to perform again?(true/false)");
            choice = in.nextBoolean();
            System.out.println();
        } while(choice==true);
        System.out.println("Done!!");
    }

}
/*OUTPUT
Enter the two numbers
3
5
Sum of 3 and 5 is = 8

Do you want to perform again?(true/false)
true

Enter the two numbers
7
11
Sum of 7 and 11 is = 18

Do you want to perform again?(true/false)
false

Done!!
 */

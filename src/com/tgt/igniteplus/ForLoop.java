// A program to accept n number from user and print its multiplication table.

package com.tgt.igniteplus;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
	// write your code here
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n = in.nextInt();

       System.out.println("The multiplication table of "+n+" is:");

       for(int i = 1;i <= 10;i++) {
           System.out.println(n + " X " + i + " = " + (n * i));
       }
       System.out.println();
       System.out.println("Done!!");

    }
}
/*OUTPUT
Enter the value of n
12
The multiplication table of 12 is:
12 X 1 = 12
12 X 2 = 24
12 X 3 = 36
12 X 4 = 48
12 X 5 = 60
12 X 6 = 72
12 X 7 = 84
12 X 8 = 96
12 X 9 = 108
12 X 10 = 120

Done!!
 */
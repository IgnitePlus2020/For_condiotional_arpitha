//A program that takes n as input number and tells if its positive or negative.

package com.tgt.igniteplus;

import java.util.Scanner;

public class SimpleIf {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        if (n>=0){
            System.out.println("The number is positive!!!");
            return;
        }

        System.out.println("The number is negative!!!");


    }

}
/*OUTPUT
Enter a number
-41
The number is negative!!!
 */
/*
Enter a number
37
The number is positive!!!
 */

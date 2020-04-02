//A program to find HCF of two numbers.

package com.tgt.igniteplus;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers whose HCF is to be known");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while(num1!=num2)
        {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        System.out.println("HCF of two numbers = "+num1);


    }
}
/*OUPUT
Enter two numbers whose HCF is to be known
45
35
HCF of two numbers = 5
 */
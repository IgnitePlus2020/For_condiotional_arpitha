package com.tgt.igniteplus;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of citizen");
        int age = in.nextInt();
        System.out.println("Enter true if registered else false");
        Boolean hasregistered = in.nextBoolean();
        System.out.println();

        if(age>17){
            if(hasregistered)
                System.out.println("Yes. You may proceed to vote.");
            else
                System.out.println("You need to register!");
        }
        else
            System.out.println("No. You are too young to vote.");
    }
}
/*OUTPUT
Enter the age of citizen
19
Enter true if registered else false
true
Yes. You may proceed to vote.
 */
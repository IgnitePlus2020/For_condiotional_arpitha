//A program to tell if a character is a vowel or a consonant.

package com.tgt.igniteplus;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = in.next().charAt(0);

        switch(c){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' : System.out.println("Its a Vowel!!!");
                        break;
            default : System.out.println("Its a Consonant!!");
        }
    }
}
/*OUTPUT
Enter a character
a
Its a Vowel!!!
 */
/*
Enter a character
v
Its a Consonant!
 */
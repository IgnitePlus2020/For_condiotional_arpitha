package com.tgt.igniteplus;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter mark scored");
        int mark = in.nextInt();

        if(mark>90){
            System.out.println("Grade is : S");
        }
        else if(mark>80){
            System.out.println("Grade is : A");
        }
        else if(mark>70){
            System.out.println("Grade is : B");
        }
        else if(mark>60){
            System.out.println("Grade is : C");
        }
        else if(mark>50){
            System.out.println("Grade is : D");
        }
        else if(mark>40){
            System.out.println("Grade is : E");
        }
        else
            System.out.println("Grade is : F");

    }
}
/*OUTPUT
Enter mark scored
78
Grade is : B
 */

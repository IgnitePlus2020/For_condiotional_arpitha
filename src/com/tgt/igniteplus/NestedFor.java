package com.tgt.igniteplus;

import java.util.Scanner;

public class NestedFor {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = in.nextInt();
        System.out.println("Enter number of columns");
        int column = in.nextInt();

        System.out.println("Pattern : ");
        System.out.println();

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
/*OUTPUT
Enter number of rows
3
Enter number of columns
4
Pattern :

 *  *  *  *
 *  *  *  *
 *  *  *  *
 */

/*A program that takes marks scored in a subject as input.
If the score is above 35 PASS is displayed,
otherwise FAIL is displayed.
 */

package com.tgt.igniteplus;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks scored in the subject");
        int score = in.nextInt();
        if(score>35){
            System.out.println("YaY!!! You Passed..!");
        }
        else{
            System.out.println("OOPS!!! Better Luck Next Time..");
        }
    }
}
/*OUTPUT
Enter the marks scored in the subject
100
YaY!!! You Passed..!
 */
/*OUTPUT
Enter the marks scored in the subject
14
OOPS!!! Better Luck Next Time..
 */

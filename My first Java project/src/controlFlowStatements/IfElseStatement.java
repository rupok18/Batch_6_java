package controlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {

    // conditional Statement..It has two parts one is  i. condition ii. block
    // the following variables are instance variable

    int a = 2;
    int b = 4;
    int c = 7;

    /* there are few types of conditional statement
    i. if statement
    ii. If else statement
    iii. if else ladder
    iv. Nested if else

     */

    public void ifStatement() {
        if (a == 2) {
            System.out.println("a is equal to 2");
            String hi = "hello";
            System.out.println(hi);
        }
    }

    public void ElseStatement() {
        if (a == 1) {
            System.out.println("a is equl to 1");
        } else {
            System.out.println("the value of a is something else");
        }
        if (b % 2 == 0)
            System.out.println("This is a even number");

        else {
            System.out.println("this is odd number");
        }
    }

    public void ifElseLadder() {

        //int a = 2;
        //int b = 4;
        //int c = 7;

        Scanner scan = new Scanner(System.in);

        System.out.println("Print your a number");
        int a = scan.nextInt();

        System.out.println("Print your b number");
        int b = scan.nextInt();

        System.out.println("Print your c number");
        int c = scan.nextInt();

        if ((a > b) && (b < c)) {
            System.out.println("a>b and b<c");

        } else if ((a > c) || (c < b)) {
            System.out.println(" a>c or c,a");

        } else if ((a + b < c) && (a > b)) {
            System.out.println(" a=b<c and a>b");
        } else {

        }
        System.out.println("nothing matches");
    }



             public void nestedIfElseStatement() {


                 if ((a > b) && (b < c)) {
                     System.out.println("a>b and b<c");

                 } else if ((a > c) || (c < b)) {
                     System.out.println(" a>c or c<a");

                 } else if ((a + b < c) && (a > b)) {
                     System.out.println(" a=b<c and a>b");
                 } else {

                     if ((a + b < c) && (a < c)) {
                         System.out.println("a+b<c && a<c");
                     } else if ((a + b < c) && (a > b)) {
                         System.out.println("a+b<c and a>b");
                     } else {

                         System.out.println("nothing matches");
                     }


                     public static void main(String[] args){

                         IfElseStatement obj = new IfElseStatement();
                     // obj.ifStatement();
                     //obj. ifElseStatement();
                     // obj.ifElseLadder();
                     obj.nestedIfElseStatement();


                 }




package com.que2;

import java.util.Scanner;

/**
 * Multiplication Table
 * Created by hsenid on 9/30/16.
 */
public class MultiplicationTbl {

    public static void main(String[] args) {

        int x;
        int y;
        int stepSize;

        System.out.println("Enter a size of x axis");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        System.out.println("Enter a size of y axis");
        Scanner inn = new Scanner(System.in);
        y = inn.nextInt();


        System.out.println("Enter a step size");
        Scanner innn = new Scanner(System.in);
        stepSize = innn.nextInt();


        // Make table size a variable

        // print header row
        System.out.print("   |");
        for (int i = 1; i <= x; i=i+stepSize)
            System.out.print(pad(i) + " ");
        System.out.println();
        // print separator
        System.out.print("---+");
        for (int i = 1; i <= x; i=i+stepSize)
            System.out.print("----");
        System.out.println();
        // print main table
        for (int i = 1; i <= y; i++) {
            System.out.print(pad(i) + "|");
            for (int j = 1; j <= x; j=j+stepSize) {
                System.out.print(pad(j*i) + " ");
            }
            System.out.println();
        }

    }

    // pad: add blanks to make it 3 long
    public static String pad(int a) {
        String s = new String();
        if (a < 10) s = "  " + a;
        else if (a < 100) s = " " + a;
        else s = "" + a;
        return s;
    }
}

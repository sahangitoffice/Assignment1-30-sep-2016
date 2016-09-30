package com.que2;

import java.util.Scanner;

/**
 * Sort User Inputs
 * Created by hsenid on 9/30/16.
 */
public class SortUsrInpts {
    public static void main(String[] args) {

        int num, i, j, temp;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter " + num + " integers: ");



        for (i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }

        for (i = 0; i < ( num - 1 ); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("output comma separated press C or output line separated press L");
        Scanner input1 = new Scanner ( System.in );
        String character;
        character = input1.next();

        if(character.equals("C")) {
            for (i = 0; i < num; i++) {
                System.out.print(array[i]+",");
            }
        }else if(character.equals("L")){
            for (i = 0; i < num; i++) {
                System.out.print(array[i]+"|");
            }
        }

    }
}

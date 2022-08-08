package com.sirius22;

import java.util.Scanner;

public class Task5_Primery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int res = 0;

        res += scanner.nextInt();

        for (int i = 1; i < n; i++) {

            int current = scanner.nextInt();

            if (res * current % 2 == 1) {
                res *= current;
                System.out.print("x");
            } else if (res + current % 2 == 1) {
                res += current;
                System.out.print("+");
            } else {
                res += current;
                System.out.print("+");
            }
            
        }

    }

}

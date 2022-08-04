package com.sirius22;

import java.util.Scanner;

public class Task2_TestGen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sum = 0;

        r = Math.max(r, 10);
        l = Math.max(l, 10);

        int lnum = 0;
        int copy = l;
        while (copy > 0) {
            lnum++;
            copy /= 10;
        }

        int rnum = 0;
        copy = r;
        while (copy > 0) {
            rnum++;
            copy /= 10;
        }

        String lstr = String.valueOf(l);
        String rstr = String.valueOf(r);

        int ldop, rdop;

        if (Integer.parseInt(String.valueOf(rstr.charAt(0))) < Integer.parseInt(String.valueOf(rstr.charAt(1)))) {
            rdop = Integer.parseInt(String.valueOf(rstr.charAt(0)));
        } else {
            rdop = Integer.parseInt(String.valueOf(rstr.charAt(0))) - 1;
        }

        if (Integer.parseInt(String.valueOf(lstr.charAt(0))) > Integer.parseInt(String.valueOf(lstr.charAt(1)))) {
            ldop = 9 - Integer.parseInt(String.valueOf(lstr.charAt(0))) + 1;
        } else {
            ldop = 9 - Integer.parseInt(String.valueOf(lstr.charAt(0)));
        }

        System.out.println("ldop: " + ldop + ", rdop: " + rdop);

        if (lnum == rnum) {
            sum = rdop - (9 - ldop);
        } else {
            sum = (rnum - lnum - 1) * 9 + ldop + rdop;
        }

        System.out.println(sum);

    }
}

package com.company;

import java.util.Scanner;

import static java.lang.Math.*;



public class Lab1Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long d[] = new long[18];
        double x[] = new double[13];
        for (int i = 0; i < d.length; i++) {
            d[i] = i + 1;
        }
        for (int i = 0; i < x.length; i++) {
            x[i] = (random() * (21.0)) - 8;
        }
        double[][] h = new double[18][13];
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 13; j++) {
                if (d[i] == 12) {
                    h[i][j] = (pow((cbrt(x[j]) / 2), 2) * (3.0 / 4.0 + cos((double) asin(((x[j] + 2) / 2.0) * E + 1))));
                } else if ((d[i] == 1) | (d[i] == 3) | (d[i] == 5) | (d[i] == 6) | (d[i] == 9) | (d[i] == 11) | (d[i] == 14) | (d[i] == 15)) {
                    h[i][j] = sin(sin(atan(pow((((x[j] + 2) / 2.0) * E + 1), 2))));
                } else {

                    h[i][j] = tan(sin(pow(((1 / 3.0) * x[j]), 2)));
                }
            }
            for (i = 0; i < h.length; i++) {
                for (int j = 0; j < h[i].length; j++)
                    System.out.printf("%.2f\t", h[i][j]);
                System.out.println();
            }
            in.close();
        }
    }
}

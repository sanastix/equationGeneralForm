package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        scan.close();

        int A = y2 - y1;
        int B = x1 - x2;
        int C = x2 * y1 - x1 * y2;

        System.out.println(A + " " + B + " " + C);

    }
}
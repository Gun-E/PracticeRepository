package org.example.test.practice;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h  = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        int input = sc.nextInt();

        int  a = (h* (3600)) + (m * 60) + s;

        a+=input;

        System.out.print(a/(3600)%24 + " ");
        System.out.print(a/60%60 + " ");
        System.out.print(a%60);
    }
}

package com.javaprograms.pattern;
import java.util.Scanner;

public class E {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < (n / 2)) || (i == (n - 1) && j < (n / 2)|| (i==(n/2) && j<(n/2)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

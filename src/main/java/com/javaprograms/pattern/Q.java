package com.javaprograms.pattern;
import java.util.Scanner;

public class Q {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i!=0 && i!=8 && i!=9 && i!=10)|| (j==(3*n/4) && i!=0 && i!=9 && i!=10 )|| (i==0&& j<= (3*n/4))||(i==(3*n/4)&& j<=(3*n/4))||(i==j && j>(n/2))){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

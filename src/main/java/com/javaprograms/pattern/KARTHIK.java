package com.javaprograms.pattern;
import java.util.Scanner;

public class KARTHIK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        //K
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 || i+j == (n/2) || i-j == (n/2))) {
                	 System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
         //A
            System.out.print("");
            for(int j=0;j<n;j++) {
    				if(i==0 && j<(n/2)&& j!=0||i==(n/2)&& j<=(n/2)||j==0 && i!=0||j==(n/2)&& j!=0 && i!=(n/2)){
    					System.out.print("* ");
    				}
    				else {
    				System.out.print("  ");
    				}	
    			}
           //R
            System.out.print("");
            for (int j = 0; j < n; j++) {
                if ((j == 0 || i==0 && j<(n/2) || i==(n/2) && j<(n/2)|| j==(n/2) && i!=0 && i!=(n/2) && i!=5 && i!=6 && i!=7 && i!=8 && i!=9 && i!=10)|| i-j==(n/2)) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            //T
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0|| j==(n/2) ) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            //H
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0|| j == (n/2)|| i==(n/2) && j<(n/2)) {
                	 System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            //I
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0|| i == (n-1)|| j==(n/2) ) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            //K
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if ((j == 0 || i+j == (n/2) || i-j == (n/2))) {
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

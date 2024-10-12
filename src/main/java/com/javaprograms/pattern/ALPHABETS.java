package com.javaprograms.pattern;
import java.util.Scanner;
public class ALPHABETS {
	    public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		//A
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j<(n/2)&& j!=0||i==(n/2)&& j<=(n/2)||j==0 && i!=0||j==(n/2)&& i!=0){
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}	
			}
			//B
			System.out.print(" ");
			for(int j=0;j<n;j++) {
				if(j==0 || (j==(n/2) && i!=0 && i!=(n/2) && i!=(n-1)) || 
				   (i==0 && j<(n/2)) || (i==(n/2) && j<(n/2)) || (i==(n-1) && j<(n/2))) {
						//j==0||(i==0 && j<=(n/2))|| (i==(n/2) &&j<(n/2))|| i==(n-1)&& j<=(n/2)||(j==(n/2) && i!=0 && i!=(n/2) && i!=(n-1))){
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}	
			}
			//C
			System.out.print("    ");
			for(int j=0;j<n;j++) {
				if(i==0 && j!=0 &&j<(n/2)|| (i==(n-1)&& j!=0&& j<(n/2))||(j==0 && i!=0 && i!=(n-1))){
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}	
			}
			//D
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < (n / 2)) || (i == (n - 1) && j < (n / 2)) || (j == (n / 2) && i!=0 && i!=(n-1) )) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
			//E
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < (n / 2)) || (i == (n - 1) && j < (n / 2)|| (i==(n/2) && j<(n/2)))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
			//F
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 && j < (n / 2)) ||(i==(n/2) && j<(n/2))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
			//G
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
                if ((i == 0 && j<(n/2))|| j == 0 ||(i==(n-1) && j<=(n/4)|| (j==( n / 4 ) && i!=1 && i!=2 && i!=3 && i!=4) || (i==(n/2) && j!=1 && j<(n/2))|| (j==(n/2) && i!=1  && i!=2 && i!=3 && i!=4))){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
			//H
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if (j == 0|| j == (n/2)|| i==(n/2) && j<(n/2)) {
                	 System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
			//I
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
                if (i == 0|| i == (n-1)|| j==(n/2) ) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//J
			System.out.print("    ");
			for (int j = 0; j < n; j++) {
                if ((i == 0 && j<(n/2))|| ( i == (n-1) && j<(n/4)) || ( j==0 && i!=1 && i!=2 && i!=3 && i!=4 && i!=5) || j==(n/4)) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//K
			System.out.print("    ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || i+j == (n/2) || i-j == (n/2))) {
                	 System.out.print("* ");
                } 
                else {
                    System.out.print("  ");
                }
            }
			//L
			System.out.print("    ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || i==(n-1))) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//M
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || j==(n-1) || i==j && j<=(n/2) || i+j ==(n-1) && j>=(n/2))) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//N
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || j==(n-1) || i==j )) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//O
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 && i!=0 && i!=(n-1)) || (j==(n/2)&& i!=0 && i!=(n-1) )|| (i==0 && j<(n/2) && j!=0 && j!=(n/2))|| (i==(n-1) && j<(n/2) && j!=0 && j!=(n/2))){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//P
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || i==0 && j<(n/2) || i==(n/2) && j<(n/2)|| j==(n/2) && i!=0 && i!=(n/2) && i!=5 && i!=6 && i!=7 && i!=8 && i!=9 && i!=10)) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//Q
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 && i!=0 && i!=8 && i!=9 && i!=10)|| (j==(3*n/4) && i!=0 && i!=9 && i!=10 )|| (i==0&& j<= (3*n/4))||(i==(3*n/4)&& j<=(3*n/4))||(i==j && j>(n/2))){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//R
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || i==0 && j<(n/2) || i==(n/2) && j<(n/2)|| j==(n/2) && i!=0 && i!=(n/2) && i!=5 && i!=6 && i!=7 && i!=8 && i!=9 && i!=10)|| i-j==(n/2)) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//S
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((i == 0 && j < (n / 2) && j!=0 ) ||  
                    (i == n / 2 && j < (n / 2) && j!=0) ||  
                    (i == n - 1 && j < n / 2)  || 
                    (j == 0 && i < (n / 2) && i!=0)||  
                    (j == n / 2  && i > n / 2 && i < n - 1)) {  
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
			//T
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if (i == 0|| j==(n/2) ) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//U
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((j == 0 || i==(n-1)||j==(n-1))) {
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//V
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
                if ((j == 0  && i<(n/2))|| ( j==(n-1) && i<(n/2)) || (i-j==(n/2))|| (j+i ==((n/2)+(n-1)))){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//W
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if (j == 0 || j==(n-1) || ( i+j== (n-1) && i>=(n/2))||(i==j && i>=(n/2))){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//X
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if (i==j|| i+j==(n-1)){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//Y
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if (i==j && j<=(n/2)|| i+j==(n-1)){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			//Z
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
                if ((i==0 && j!=(n-1)) || (i+j==(n-1))||(i==(n-1) && j!=0)){
                	 System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
			System.out.println();
		 }
		
	}

}
package org.capgemini.com;

import java.util.Scanner;

public class Q7 { 

    public static void partition(int n) {
        partition(n, n, "");
    }
    public static void partition(int n, int max, String prefix) {
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
  
        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n-i, i, prefix + " " + i);
        }
    }


    public static void main(String[] args) { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number");
        int n = scan.nextInt();
        partition(n);
    }

}

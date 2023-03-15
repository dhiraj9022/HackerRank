package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int E[] = new int[n];
        int L[] = new int[n];
        for (int i = 0; i < E.length; i++) {
            E[i] = sc.nextInt();
        }
        for (int i = 0; i < L.length; i++) {
            L[i] = sc.nextInt();
        }
        int max =0;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum = (sum+E[i]-L[i]);
            max = Math.max(sum, max);
        }
        System.out.println("Maximum number of guest : "+max);
    }
}
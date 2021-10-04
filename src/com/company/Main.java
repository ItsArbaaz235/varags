package com.company;

import java.util.Scanner;

public class Main {
static void sum(int...arr) {
    int output = 0;
    for (int a : arr) {
        output += a;
    } 
    System.out.println(output);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers which you want to add");
        System.out.print("the sum of two numbers are : ");
        // System.out.println(sum(8,9,10,13,45));
        // System.out.println(sum(63,50));
        //System.out.println(sum(30,40,50,90,60,30,80,90));
        int n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



    }}

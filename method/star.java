/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeworks.method;

import java.util.Scanner;

/**
 *
 * @author Hatukay
 */
public class star {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = scanner.nextInt();
        trigon(x);
    }
    public static void trigon(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
         
            for (int j = 0; j <= i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

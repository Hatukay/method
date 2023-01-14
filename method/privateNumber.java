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
public class privateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a numb:");
         int x = scanner.nextInt();
         privateNumb(x);
    }
    public static void privateNumb(int n){
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                System.out.println("This number isn't private.");
                break;
            }
            else{
                System.out.println("This number is private.");
            break;
            }
        }
    }
}

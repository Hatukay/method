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
public class squareTotal {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a numb:");
         int x = scanner.nextInt();
         total(x);
    }
    public static void total(int n){
        int sum =0;
       
        for (int i = 0; i <= n; i++) {
            sum+=i*i;
        }
        System.out.println(sum);
        
}
}

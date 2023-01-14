/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeworks.method;

/**
 *
 * @author Hatukay
 */
public class arrayArrangement {
    public static void main(String[] args) {
        int[] array = {1,2,4551,8415,121,112,5};
        arrangement(array);
    }
    public static void arrangement(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                int tmp=0;
                if (ar[i]>ar[j]) {
                    tmp = ar[i];  
                    ar[i] = ar[j];  
                    ar[j] = tmp;  
                }
            }
            System.out.println(ar[i]); 
        }
}
}

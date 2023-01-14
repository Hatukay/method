/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeworks.method;

/**
 *
 * @author Hatukay
 */
public class arraySum {
    public static void main(String[] args) {
        int array1[][] = {{1,2,3},{5,95,2},{8,1,21}};
        int array2[][] = {{5,9,2},{7,26,3},{92,25,1}};
        sum(array1, array2);

    }
    public static void sum(int ar1[][],int ar2[][]){
        int sum[][] = null;

        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1.length; j++) {
                
                sum[i][j]=ar1[i][j]+ar2[i][j];
            }
        }
      }
    }

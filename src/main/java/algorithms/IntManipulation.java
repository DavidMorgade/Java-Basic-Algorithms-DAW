/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author morgade
 */
public class IntManipulation {
    
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + (min)); 
    }
    public static void pairsBetween(int startNum, int endNum) {
        for (int i = startNum; i <= endNum; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static int toOctal(int decimal) {
        int octal = 0;
        int digit;

        final int DIVISOR = 8;

        for (int i = decimal, j = 0; i > 0; i /= DIVISOR, j++) {
            digit = i % DIVISOR;
            octal += digit * Math.pow(10, j);
        }
        return octal;
    }
    public static int validateNumber(int min, int max) {
        Scanner sc = new Scanner(System.in);
        
        if(min > max) {
            int aux = min;
            min = max;
            max = aux; 
        }
        
        int numero;
        
        do {
            System.out.println("Escribe un número:");
            numero = sc.nextInt();
            
            if(numero <= min || numero >= max) {
                System.out.println("Debes escribir un numero entre "+min+" y "+max);
            }
            
        } while(numero <= min || numero >= max);
           
        return numero;
    }
    public static void showDigits(int num) {
        
        final int DIVISOR = 10;
        
        for (int i = num; i > 0; i/=10) {
            System.out.println(i % DIVISOR + " ");
        }   
    }
    public static int biggestDigit(int num) {

        int modulus = 0;
        for (int i = num; i > 0; i /= 10) {
            int rest = i % 10;
            if (rest > modulus) {
                modulus = rest;
            }
        }
        return modulus;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.morgade.javaalgorithms;

import algorithms.IntManipulation;
import algorithms.BooleanCheck;
import algorithms.StringResolver;


/**
 *
 * @author morgade
 */
public class JavaAlgorithms {

    public static void main(String[] args) {
        
        IntManipulation n = new IntManipulation();
        BooleanCheck b = new BooleanCheck();
        StringResolver s = new StringResolver();
        
        int number =n.biggestDigit(987);
        System.out.println(number);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integer.algorithms;

/**
 *
 * @author morgade
 */
public class IntManipulation {
    
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + (min)); 
    }
}

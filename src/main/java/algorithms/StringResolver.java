/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

/**
 *
 * @author morgade
 */
public class StringResolver {
    
    public static int countLetters(String input, boolean type) {
        int min, max;
        int counter = 0;
            if(type) {
               min = 65;
               max = 90;
            } else {
                min = 97;
                max = 122;
            }
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) >= min && input.charAt(i) <= max) {
                    counter++;
                }
        }
        return counter;
    }
}

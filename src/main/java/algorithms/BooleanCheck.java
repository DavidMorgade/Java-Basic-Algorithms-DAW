/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;


/**
 *
 * @author morgade
 */
public class BooleanCheck {
    
    
    public static boolean isPalindrome(String input) {        
        input = input.toLowerCase().trim();
        var reversed = "";
        char x;
        for (int i = input.length() - 1; i >= 0; i--) {
            x = input.charAt(i);
            reversed += x;
        }
        return reversed.equals(input);
    }
}

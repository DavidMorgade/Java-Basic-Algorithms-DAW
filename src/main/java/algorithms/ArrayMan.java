/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

/**
 *
 * @author morgade
 */
public class ArrayMan {

    public static void fillArr(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int random = IntManipulation.randomNumber(min, max);
            array[i] = random;
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int sumaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
    public static double mediaArray(int[] array) {
        double media = (double) sumaArray(array) / array.length;
        return media;
    }
}

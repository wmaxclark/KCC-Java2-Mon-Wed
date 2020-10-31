/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc;

import java.util.function.Function;

/**
 *
 * @author k0519415
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Function<Integer, Boolean> isEven = num -> num % 2 == 0;
        Function<String, Integer> numCharacters = str -> str.length();
        String lastName = "Hauschildt";
        int number = numCharacters.apply(lastName);
        if(isEven.apply(number)) {
            System.out.println(lastName + " has an even number of characters (" + number +").");
        } else {
            System.out.println(lastName + " has an odd number of characters (" + number +").");
        }
    }
    
}

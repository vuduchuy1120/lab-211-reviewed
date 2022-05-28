/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Valilator {

    private static final  Scanner SC = new Scanner(System.in);

    private Valilator() {
    }
    
    
    /**
     * Represent a double number converted from a string.
     * 
     * @param   errMessage a string notice error.
     * @param   min        a minimum number can be input.
     * @param   max        a maximum number can be input.
     * @return a double number.
     * @throws NumberFormatException if value input not is number and over range.

     */
    public static double getDouble(double min,double max, String errMessage) {
        double result;
        while (true) {
            try {
                result = Double.parseDouble(SC.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println(errMessage);
            }
        }
    }

    /**
     * Represent a integer number converted from a string.
     * 
     * @param   errMessage a string notice error.
     * @param   min        a minimum number can be input.
     * @param   max        a maximum number can be input.
     * @return a integer number.
     * @throws NumberFormatException if value input not is number and over range.
     */
    public static int getInt(int min, int max, String errMessage) {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(SC.nextLine().trim());
                if (n <= min || n > max) {
                    throw new NumberFormatException();
                }
                else
                    return n;
            } catch (NumberFormatException e) {
                System.err.println(errMessage);
            }
        }
    }



}

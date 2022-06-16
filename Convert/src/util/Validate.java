/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;
import exception.OutOfRangeException;

/**
 *
 * @author ASUS
 */
public class Validate {

    private final static Scanner SC = new Scanner(System.in);
    private static final String BINARY_VALID = "^[01]+$";
    private static final String DECIMAL_VALID = "^[0-9]+$";
    private static final String HEXADECIMAL_VALID = "^[0-9a-fA-F]+$";

    //check user input number limit
    public static int checkInputIntLimit(int minValue, 
            int maxValue, 
            String errorMessageInvalid,
            String errorMessageOutOfRange) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(SC.nextLine().trim());
                if (result < minValue || result > maxValue) {
                    throw new OutOfRangeException(errorMessageOutOfRange);
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println(errorMessageInvalid);
            }catch(OutOfRangeException e){
                System.out.println(e.getMessage());
            }
        }
    }

    //check user input number binary
    public static String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        //loop until user input correct
        while (true) {
            result = SC.nextLine().trim();
            if (result.matches(BINARY_VALID)&& result != "") {
                return result;
            }
            else{
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
            }
        }
    }

    //    //check user input number binary
    public static String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        //loop until user input correct
        while (true) {
            result = SC.nextLine().trim();
            if (result.matches(DECIMAL_VALID)&& result != "") {
                return result;
            }
            else{
            System.err.println("Must be enter 0-9");
            System.out.print("Enter again: ");
            }
        }
    }

    //    //check user input number binary
    public static String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        //loop until user input correct
        while (true) {
            result = SC.nextLine().trim();
            if (result.matches(HEXADECIMAL_VALID) && result != "") {
                return result;
            }
            else{
            System.err.println("Must be enter 0-9 A-F");
            System.out.print("Enter again: ");
            }
        }
    }
}

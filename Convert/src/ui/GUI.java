/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import util.Validator;
import function.Convert;
/**
 *
 * @author ASUS
 */
public class GUI {

    public void progress() {
        Convert conv = new Convert();
        int input;
        int output;
        
        String data = "";
        System.out.println("==== Convert System ====");
        System.out.println("Choose the base number input");
        menuChoice();
        
        input = Validator.checkInputIntLimit(0, 4);
        System.out.println("Choose the base number out");
        menuChoice();
        
        output = Validator.checkInputIntLimit(0, 4); 
        
        switch(input){
            case 1 : 
                data = Validator.checkInputBinary();
                break;
            case 2:
                data = Validator.checkInputDecimal();
                break;
            case 3:
                data = Validator.checkInputHexaDecimal();
                break;
        }
        System.out.println(conv.convert(input, output, data));
    }

    public void menuChoice() {
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal");
    }
    
}

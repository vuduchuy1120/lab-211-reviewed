/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import ui.Helpper;
import util.Validate;
import function.ChangeBaseSystem;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChangeBaseSystem changeBaseSystem = new ChangeBaseSystem();
        int input;
        int output;
        
        String data = "";
        System.out.println("==== Convert System ====");
        System.out.println("Choose the base number input");
        Helpper.menuChoice();
        
        input = Validate.checkInputIntLimit(
                1,
                4,
                "Input value must digit, try again!",
                "Out of range, try again!");
        System.out.println("Choose the base number out");
        Helpper.menuChoice();
        
        output = Validate.checkInputIntLimit(
                1,
                4,
                "Input value must digit, try again!",
                "Out of range, try again!");
        
        switch(input){
            case 1 : 
                data = Validate.checkInputBinary();
                break;
            case 2:
                data = Validate.checkInputDecimal();
                break;
            case 3:
                data = Validate.checkInputHexaDecimal();
                break;
        }
        System.out.println(changeBaseSystem.convert(input, output, data));
    }
}

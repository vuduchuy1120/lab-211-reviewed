/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author ASUS
 */
public class Convert {

    public String convert(int heso1, int heso2, String value) {
        String result = "";
        switch (heso2) {
            case 1:
                result = convertToBinary(heso1, value);
                break;
            case 2:
                result = convertToDecimal(heso1, value);
                break;
            case 3:
                result = convertToHexa(heso1, value);
                break;

        }
        return result;
    }

    public String convertToBinary(int heso1, String value) {
        String result = "";
        switch (heso1) {
            case 1:
                result = value;
                break;
            case 2:
                result = Integer.toBinaryString(Integer.parseInt(value));
                break;
            case 3:
                result = Integer.toBinaryString(Integer.parseInt(value,16));
                break;
        }
        return result;
    }
    
    public String convertToDecimal(int heso1, String value) {
        String result = "";
        switch (heso1) {
            case 1:
                result = String.valueOf(Integer.parseInt(value, 2));
                break;
            case 2:
                result = value;
                break;
            case 3:
                result = String.valueOf(Integer.parseInt(value, 16));
                break;
        }
        return result;
    }
    
    public String convertToHexa(int heso1, String value) {
        String result = "";
        switch (heso1) {
            case 1:
                result = Integer.toHexString(Integer.parseInt(value,2));
                break;
            case 2:
                result = Integer.toHexString(Integer.parseInt(value,10));
                break;
            case 3:
                result = value;
                break;
        }
        return result.toUpperCase();
    }
}

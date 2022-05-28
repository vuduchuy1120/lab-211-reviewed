
package main;

import function.Calculator;
import util.Valilator;

public class J1SP0060 {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.inputBills();
        System.out.print("Input value of wallet: ");
        double wallet = Valilator.getDouble(0,Integer.MAX_VALUE,"lỗi");
        System.out.println("This is total of bill: " + cal.totalBill());
        cal.compareWithTotal(wallet);
    }




}



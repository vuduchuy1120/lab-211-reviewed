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
import util.Valilator;

public class Calculator {

    private double[] bills;

    public Calculator() {
    }

    public double[] getBills() {
        return bills;
    }

    public void setBills(double[] bills) {
        this.bills = bills;
    }
    
    
    public double[] inputBills() {
        System.out.print("Input number of bills: ");
        int n = Valilator.getInt(0,Integer.MAX_VALUE,
                "Input value must integer positive number!. Please enter again!!");
        bills = new double[n];
        for (int i = 0; i < bills.length; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
                bills[i] = Valilator.getDouble(
                    0,
                    Double.MAX_VALUE,
                    "Input value must integer positive number! Please enter again!"
            );
        }
        return bills;
    }

  
    
    public double totalBill() {
        double total = 0;
        for (int i = 0; i < bills.length; i++) {
            total += bills[i];
        }
        return total;
    }


    public void compareWithTotal(double wallet) {
        if (totalBill() <= wallet) {
            System.out.println("You can buy it!");
        } else {
            System.out.println("You can't buy it!");
        }
    }

}

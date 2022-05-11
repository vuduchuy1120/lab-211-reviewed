
package j1sp0060;

import java.util.Scanner;

public class J1SP0060 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double[] bills = inputBill();
        double wallet = checkInputWallet();
        double total = totalBill(bills);
        printTotalAndSummary(total, wallet);
    }

    private static double checkInputBill(int i) {
        double result;
        while (true) {
            try {
                System.out.print("Input value of bill " + (i + 1) + ": ");
                result = Double.parseDouble(sc.nextLine());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Data enter must a number positive!!");
                System.out.println("Please enter again!!");
            }
        }
    }

    private static double checkInputWallet() {
        double result;
        while (true) {
            try {
                System.out.print("Input value of wallet: ");
                result = Double.parseDouble(sc.nextLine());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Data enter must a number positive!!");
                System.out.println("Please enter again!!");
            }
        }
    }

    private static int checkInt() {
        int n;
        while (true) {
            try {
                System.out.print("Input number of bills: ");
                n = Integer.parseInt(sc.nextLine().trim());
                if (n <= 0) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Data enter must a number positive!!");
                System.out.println("Please enter again!!");

            }
        }
    }

    private static double[] inputBill() {
        int n = checkInt();
        double[] bills = new double[n];
        for (int i = 0; i < bills.length; i++) {
            bills[i] = checkInputBill(i);
        }
        return bills;
    }

    private static double inputWallet() {
        double wallet = checkInputWallet();
        return wallet;
    }

    private static double totalBill(double[] bills) {
        double total = 0;
        for (int i = 0; i < bills.length; i++) {
            total += bills[i];
        }
        return total;
    }

    private static void printTotalAndSummary(double total, double wallet) {
        System.out.println("This total of bills is: " + total);
        if (total <= wallet) {
            System.out.println("You can buy it!");
        } else {
            System.out.println("You can't buy it!");
        }
    }

}



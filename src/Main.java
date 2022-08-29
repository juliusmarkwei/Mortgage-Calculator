/*
    A simple Mortgage Payment Calculator
    designed in Java programming language
    to easily calculate your estimate
    monthly mortgage payments.
    Created on 25th August 2022.
    Author: Julius Markwei, alias: CEO
 */
import java.text.NumberFormat;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declaring constant variables
        final byte percentage = 100;
        final byte monthsInYears = 12;

        // a welcome message to be displayed before calculation
        String welcome = "-----------Mortgage Payment Calculator------------".toUpperCase();
        System.out.println(welcome); System.out.println();

        // calling the Scanner class for reading user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal:\t\t\t\t\t");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate:\t\t");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / percentage / monthsInYears;

        System.out.print("Period (Years):\t\t\t\t");
        int years = scanner.nextByte();
        int numberOfPayment = years * monthsInYears;

        System.out.println("\t\t\t\t\t\t\t-------");
        // mortgage calculation is done using the model M = 1 (1+r)^n/(1+r)^n
        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,
                numberOfPayment)) / (Math.pow(1 + monthlyInterestRate, numberOfPayment) - 1);
        // converting the result in double to Currency (Dollar $)
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        // finally displaying result after calculation of mortgage
        System.out.println("Mortgage:\t\t\t\t\t"+formatter.format(mortgage));
    }
}

main()
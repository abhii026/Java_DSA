// package assignment1;
// Input currency in rupees and output in USD.

import java.util.Scanner;

public class inrtousd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rupees: ");
        // float rupees = input.nextFloat();
        // float usd = rupees/87.18f;
        // System.out.println("INR to USD is: "+usd);
        float usd = input.nextFloat();
        float inr =usd*85.32f;
        System.out.println("USD to INR is: "+inr);
    }
    
}
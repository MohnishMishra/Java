package Lab5;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1 to convert binary to decimal, 2 to convert decimal to binary: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            int binary = scan.nextInt();
            int decimal = binaryToDecimal(binary);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimal = scan.nextInt();
            int binary = decimalToBinary(decimal);
            System.out.println("Binary equivalent: " + binary);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static int binaryToDecimal(int binary) {
        int decimal = 0, power = 0;
        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        return decimal;
    }

    private static int decimalToBinary(int decimal) {
        int binary = 0, power = 1;
        while (decimal != 0) {
            int lastDigit = decimal % 2;
            binary += lastDigit * power;
            power *= 10;
            decimal = decimal / 2;
        }
        return binary;


    }
}

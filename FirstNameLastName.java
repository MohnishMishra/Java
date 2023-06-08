package Lab5;

import java.util.Scanner;

public class FirstNameLastName {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fname = myObj.nextLine();
        System.out.println("Enter the last name: ");
        String lname = myObj.nextLine();
        System.out.println(lname + fname);
    }
}

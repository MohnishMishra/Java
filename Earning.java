import java.util.*;
import General.*;
import Marketing.*;
public class Earning{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        String empid = sc.nextLine();
        System.out.println("Enter basic salary: ");
        int bs = sc.nextInt();

        double te = earnings(bs);
        double ta = tallowance(bs);

        System.out.println("Emp ID: "+empid);
        System.out.println("Basic Salary: "+bs);
        System.out.println("Total Earnings: "+te);
        System.out.println("Travel Allowance: "+ta);

        sc.close();
    }
} 
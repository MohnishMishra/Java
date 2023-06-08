import java.util.Scanner;

interface Employee {
    double earnings0();

    double deductions();

    double bonus0();
}

class Manager implements Employee {
    private double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double earnings0() {
        return this.basicSalary + 0.8 * this.basicSalary + 0.15 * this.basicSalary;
    }

    public double deductions() {
        return 0.12 * this.basicSalary;
    }

    public double bonus0() {
        return 0;
    }
}

class Substaff extends Manager {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    public double bonus0() {
        return 0.8 * super.earnings0();
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary amount: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff(basicSalary);

        double earnings = substaff.earnings0();
        double deductions = substaff.deductions();
        double bonus = substaff.bonus0();

        System.out.printf("Earnings: %.2f%n", earnings);
        System.out.printf("Deductions: %.2f%n", deductions);
        System.out.printf("Bonus: %.2f%n", bonus);
    }
}
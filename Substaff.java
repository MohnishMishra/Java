import java.util.*;
public class Substaff extends Manager {
    public Substaff() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basic: ");
        basic = sc.nextInt();
        sc.close();
    }
    public Substaff(double basic) {
        this.basic = basic;
    }
    public double bonus() {
        return 0.5 * basic;
    }
}
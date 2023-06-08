public abstract class Manager implements Employee {
    protected double basic;

    public double earnings() {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    public double deductions() {
        return 0.12 * basic;
    }
    public abstract double bonus();
}
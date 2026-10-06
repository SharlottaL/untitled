public abstract class Employee implements Payable {
    private String nameE;
    private double baseSalary;
    public Employee(String nameE, double baseSalary) {
        this.nameE = nameE;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return nameE;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public abstract double getBonus();

    @Override
    public double calculatePay() {
        return baseSalary + getBonus();
    }
}


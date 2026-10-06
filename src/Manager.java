public class Manager extends Employee {
    public Manager(String nameM, double baseSalary) {
        super(nameM,baseSalary);
    }

    @Override
    public double getBonus() {
        return getBaseSalary() * 0.2;
    }

}

public class Developer extends Employee {
    public Developer(String nameD, double baseSalary) {
        super(nameD,baseSalary);
    }

    @Override
    public double getBonus() {
        return 15000;
    }

}

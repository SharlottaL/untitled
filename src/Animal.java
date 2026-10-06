public abstract class Animal {
    private String nameA;
    public Animal(String name) {
        this.nameA = nameA;
    }

    public String getName() {
        return nameA;
    }
    public abstract void makeSound();
    void sleep()
    {
        System.out.println("Спит");
    }
}

public class Cat extends Animal{
    public Cat(String nameA)
    {
        super(nameA);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Мяу!");
    }
}


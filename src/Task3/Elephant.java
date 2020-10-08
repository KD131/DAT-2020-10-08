package Task3;

public class Elephant extends Animal{
    Elephant(int numberOfLegs)
    {
        super(numberOfLegs);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Elephant goes \"toot\"");
    }
}

package Task3;

public class Parrot extends Animal{
    Parrot(int numberOfLegs)
    {
        super(numberOfLegs);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Parrot goes \"CAAAWW\"");
    }
}

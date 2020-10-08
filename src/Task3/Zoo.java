package Task3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public void makeAllSounds()
    {
        for(Animal a:animals)
        {
            a.makeSound();
        }
    }

    public void addAnimal(Animal a)
    {
        animals.add(a);
    }

    public void printNumberOfLegs()
    {
        int count = 0;
        for (Animal a:animals)
        {
            count += a.getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: " + count);
    }
}

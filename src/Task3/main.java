package Task3;

public class main {
    public static void main(String[] args) {
        Zoo z1 = new Zoo();
        Animal a1 = new Elephant(4);
        Animal a2 = new Parrot(2);
        Animal a3 = new Dolphin(0);

        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.addAnimal(a3);

        z1.makeAllSounds();
        z1.printNumberOfLegs();
    }
}

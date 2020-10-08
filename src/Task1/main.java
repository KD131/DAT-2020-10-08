package Task1;

public class main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Kasper", 26);
        Car c1 = new Car("Ford", "Focus", 2015, "5-door hatchback (maybe)");
        Car c2 = new Car("Tesla", "S", 2020, "does it really matter?");

        c1.setDriver(d1);
        c2.setDriver(d1);

        System.out.println(c1.toString() + d1.toString() + " and the transmission broke.");
        System.out.println(c2.toString() + d1.toString() + " and the world is slightly less polluted. But Elon got richer. You win some, you lose some.");
    }
}

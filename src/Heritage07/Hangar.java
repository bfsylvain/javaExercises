package Heritage07;

public class Hangar {

    public static void main(String[] args) {

        Boat Titanic = new Boat("Titanic", 512);
        Car Panda = new Car("Fiat", 456);

        System.out.println(Panda.doStuff());
        System.out.println(Titanic.doStuff());
    }
}

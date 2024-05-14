package Heritage07;

public class Boat extends Vehicule {

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }
    @Override
    public String doStuff() {
        return " I am " +this.getBrand()+ " and I glouglou";
    }
}

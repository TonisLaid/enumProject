//1. Create enum Planets
// a) Override toString method . It should print relative size of a planet and it’s name.
//      E.g . Huge Jupiter”, „Small Pluto”.
// b) Create distanceFromEarth method
// c) Verify both methods for multiple planets

public enum Planets {
    SATURN ("Big", 200000.0),
    PLUTO ("Small", 5000.0),
    EARTH ("Average", 6000.0),
    ;

    String size;
    Double mass;

    Planets(String size, Double mass) {
        this.size = size;
        this.mass = mass;
    }

    public void distanceFromEarth(){
        System.out.println("Size of the planet " + size);
    }
}

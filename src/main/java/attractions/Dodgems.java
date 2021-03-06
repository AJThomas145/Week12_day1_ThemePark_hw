package attractions;

import behaviours.IReviewed;

public class Dodgems extends Attraction implements IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(people.Visitor visitor) {
        if ( visitor.getAge() < 12) {
            return defaultPrice() / 2; }
        else {
            return defaultPrice();
        }}


}

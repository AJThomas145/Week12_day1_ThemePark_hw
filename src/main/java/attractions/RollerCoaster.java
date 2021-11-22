package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        int age = visitor.getAge();
        double height = visitor.getHeight();

        if (age >= 12 && height > 145) {
            return true; }
        else {
            return false;
        }}
}

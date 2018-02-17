package java_docs_tutorials;


/*
 * Works in 1.1+Swing, 1.4, and all releases in between.
 * Used by the Converter example.
*/
public class aa_Unit {
    String description;
    double multiplier;

    aa_Unit(String description, double multiplier) {
        super();
        this.description = description;
        this.multiplier = multiplier;
    }

    public String toString() {
        String s = "Meters/" + description + " = " + multiplier;
        return s;
    }
}

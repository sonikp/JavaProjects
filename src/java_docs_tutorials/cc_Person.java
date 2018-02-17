package java_docs_tutorials;


import java.util.Vector;

public class cc_Person {
    cc_Person father;
    cc_Person mother;
    Vector<cc_Person> children;
    private String name;

    public cc_Person(String name) {
        this.name = name;
        mother = father = null;
        children = new Vector<cc_Person>();
    }

    /**
    *   Link together all members of a family.
    *
    *   @param pa the father
    *   @param ma the mother
    *   @param kids the children
    */
    public static void linkFamily(cc_Person pa,
                                  cc_Person ma,
                                  cc_Person[] kids) {
        for (cc_Person kid : kids) {
            pa.children.addElement(kid);
            ma.children.addElement(kid);
            kid.father = pa;
            kid.mother = ma;
        }
    }

/// getter methods ///////////////////////////////////

    public String toString() { return name; }
    public String getName() { return name; }
    public cc_Person getFather() { return father; }
    public cc_Person getMother() { return mother; }
    public int getChildCount() { return children.size(); }
    public cc_Person getChildAt(int i) {
        return (cc_Person)children.elementAt(i);
    }
    public int getIndexOfChild(cc_Person kid) {
        return children.indexOf(kid);
    }
}

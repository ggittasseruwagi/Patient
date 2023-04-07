package vut;

public abstract class Address {

    /*
    attributes
    *** include Street, Town, PostalCode
    constructor
    *** code the parameterised constructor only
    Methods
    *** Override the toString method to return all the attributes of the class separated by a semi-colon(;).
     */
    String Street;
    String Town;
    int PostalCode;

    public void getStreet() {}
    public void getTown() {}
    public void PostalCode() {}

    public String setStreet(String Street) {
        return this.Street;
    }

    public String setTown(String Town) {
        return this.Town;
    }

    public int setPostalCode() {
        return this.PostalCode;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

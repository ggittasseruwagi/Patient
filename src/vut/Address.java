package vut;

public abstract class Address {

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

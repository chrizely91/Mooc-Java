

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof LicensePlate)) return false;

        LicensePlate objConverted = (LicensePlate) obj;

        return this.liNumber.equals(objConverted.liNumber) && this.country.equals(objConverted.country);

    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((liNumber == null) ? 0 : liNumber.hashCode());
        return result;
    }

}

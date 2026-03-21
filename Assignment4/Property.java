/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A property being managed by a company.
 * Due: 03/31/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Property {
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;

    /** No-argument constructor */
    public Property() {}

    /**
     * Constructor with arguments
     *
     * @param propertyName name of the property
     * @param city city the property is in
     * @param rentAmount rent of the property
     * @param owner owner of the property
     */
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
    }

    /**
     * Copy constructor
     *
     * @param p the property to copy
     */
    public Property(Property p) {
        this.propertyName = p.propertyName;
        this.city = p.city;
        this.rentAmount = p.rentAmount;
        this.owner = p.owner;
    }

    /**
     * Gets the name of the property
     *
     * @return property name
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Gets the city the property is in
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Gets the rent of the property
     *
     * @return rent amount
     */
    public double getRentAmount() {
        return rentAmount;
    }

    /**
     * Gets the owner of the property
     *
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the name of the property
     *
     * @param propertyName property name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Sets the city the property is in
     *
     * @param city property city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the rent of the property
     *
     * @param rentAmount property rent amount
     */
    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    /**
     * Sets the owner of the property
     *
     * @param owner property owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /** toString override */
    public String toString() {
        return String.format(
                "%s, %s, Rent: $%.2f, Owner: %s", propertyName, city, rentAmount, owner);
    }
}

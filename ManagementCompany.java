/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A company managing properties.
 * Due: 03/31/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class ManagementCompany {
    public static final int MAX_PROPERTIES = 5;
    private String name;
    private String taxId;
    private Property[] properties;
    private int propertyCount;

    /**
     * Main constructor
     *
     * @param name name of the new company
     * @param taxId tax ID of the new company
     */
    public ManagementCompany(String name, String taxId) {
        this.name = name;
        this.taxId = taxId;
        this.properties = new Property[MAX_PROPERTIES];
        this.propertyCount = 0;
    }

    /**
     * Copy constructor
     *
     * @param company the company to copy
     */
    public ManagementCompany(ManagementCompany company) {
        this.name = company.name;
        this.taxId = company.taxId;
        this.properties = new Property[MAX_PROPERTIES];
        this.propertyCount = company.propertyCount;

        for (int i = 0; i < company.propertyCount; i++) {
            this.properties[i] = new Property(company.properties[i]);
        }
    }

    /**
     * Adds a property to the properties array
     *
     * @param p property to add
     * @return index of the new property of -1 if array is full
     */
    public int addProperty(Property p) {
        if (propertyCount >= MAX_PROPERTIES) {
            return -1;
        }

        properties[propertyCount] = new Property(p);
        return propertyCount++;
    }

    /**
     * Calculates the sum of all of the properties the company is managing
     *
     * @return sum of rents
     */
    public double totalRent() {
        double sum = 0;

        for (int i = 0; i < propertyCount; i++) {
            sum += properties[i].getRentAmount();
        }

        return sum;
    }

    /**
     * Gets the number of properties the company is managing
     *
     * @return property count
     */
    public int getPropertyCount() {
        return propertyCount;
    }

    /**
     * Gets the name of the company
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the tax ID of the company
     *
     * @return tax Id
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Gets the property at a given index
     *
     * @param i the index of the property
     * @return the property at the index
     */
    public Property getProperty(int i) {
        return new Property(properties[i]);
    }

    /** toString override */
    public String toString() {
        String startString =
                String.format("Management Company: %s (Tax ID: %s)\nProperties:", name, taxId);

        StringBuilder sb = new StringBuilder(startString);

        for (int i = 0; i < propertyCount; i++) {
            sb.append(String.format("\n  %d: %s", i, properties[i]));
        }

        return sb.toString();
    }
}

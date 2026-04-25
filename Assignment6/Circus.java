import java.util.ArrayList;
import java.util.List;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A class representing a circus
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class Circus {
    private List<Animal> animals;
    private List<Person> persons;
    private List<Building> buildings;
    private List<Ticket> tickets;

    /** Constructor for circus */
    public Circus() {
        animals = new ArrayList<>();
        persons = new ArrayList<>();
        buildings = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    /**
     * Returns animals list for tests
     *
     * @return animals list
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Returns persons list for tests
     *
     * @return persons list
     */
    public List<Person> getPersons() {
        return persons;
    }

    /**
     * Returns buildings list for tests
     *
     * @return buildings list
     */
    public List<Building> getBuildings() {
        return buildings;
    }

    /**
     * Returns tickets list for tests
     *
     * @return tickets list
     */
    public List<Ticket> getTickets() {
        return tickets;
    }

    /**
     * Adds a building to the buildings list
     *
     * @param building new building to add
     */
    public void addBuilding(Building building) {
        buildings.add(building);
    }

    /** Prints all buildings */
    public void displayAllBuildings() {
        for (Building building : buildings) {
            System.out.println(building);
        }
    }

    /**
     * Adds a person to the persons list
     *
     * @param person new persons to add
     */
    public void addPerson(Person person) {
        persons.add(person);
    }

    /** Prints all persons */
    public void displayAllPersons() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    /**
     * Adds a animal to the animals list
     *
     * @param animal new animal to add
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /** Prints all animals */
    public void displayAllAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    /** Sorts animals by age */
    public void sortAnimalsByAge() {
        for (int i = 0; i < animals.size() - 1; i++) {
            int minJ = i;

            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(j).getAge() < animals.get(minJ).getAge()) {
                    minJ = j;
                }
            }

            if (minJ != i) {
                Animal temp = animals.get(minJ);
                animals.set(minJ, animals.get(i));
                animals.set(i, temp);
            }
        }
    }

    /** Sorts animals by name */
    public void sortAnimalsByName() {
        for (int i = 0; i < animals.size() - 1; i++) {
            int minJ = i;

            for (int j = i + 1; j < animals.size(); j++) {
                if (animals.get(j).getName().compareToIgnoreCase(animals.get(minJ).getName()) < 0) {
                    minJ = j;
                }
            }

            if (minJ != i) {
                Animal temp = animals.get(minJ);
                animals.set(minJ, animals.get(i));
                animals.set(i, temp);
            }
        }
    }

    /**
     * Searches for an animal by name and prints it to the console
     *
     * @param searchName name of animal to search for
     */
    public void searchAnimalByName(String searchName) {
        String query = searchName.toLowerCase();
        boolean isFound = false;
        int i = 0;

        while (!isFound && i < animals.size()) {
            System.out.println(i);
            Animal animal = animals.get(i);

            if (animal.getName().toLowerCase().equals(query)) {
                isFound = true;
                System.out.println(animal);
            }

            i++;
        }

        if (!isFound) {
            System.out.printf("Animal '%s' not found", searchName);
        }
    }


    /**
     * Adds a ticket to the tickets list
     *
     * @param ticket new ticket to add
     */
    // Add ticket
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    /**
     * Creates a new ticket, call addTicket with it, and returns it
     * 
     * @param dayOfWeek day of the week ticket was bought
     * @param price price of ticket
     * @param customerTypeName type of customer
     * @return the new ticket
     */
    public Ticket generateTicket(String dayOfWeek, double price, String customerTypeName) {
        Ticket ticket = new Ticket(dayOfWeek, price, customerTypeName);
        addTicket(ticket);
        return ticket;
    }
}

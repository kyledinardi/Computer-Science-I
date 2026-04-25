import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: Tests for the Circus class
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

class CircusTestStudent {
    Circus circus;

    @BeforeEach
    void setUp() throws Exception {
        circus = new Circus();
    }

    @AfterEach
    void tearDown() throws Exception {
        circus = null;
    }

    @Test
    void testAddBuilding() {
        Arena arena = new Arena("Red", 120, 100, "Arena.jpg");
        circus.addBuilding(arena);
        assertTrue(circus.getBuildings().get(0).toString().equals(arena.toString()));
    }

    @Test
    void testAddPerson() {
        Acrobatic acrobat = new Acrobatic("John", 25, 5, "Trapeze Artist", "acrobat.jpg");
        circus.addPerson(acrobat);
        assertTrue(circus.getPersons().get(0).toString().equals(acrobat.toString()));
    }

    @Test
    void testAddAnimal() {
        Bird bird = new Bird("Polly", 20, "Parrot", "Blue", "Bird.jpg");
        circus.addAnimal(bird);
        assertTrue(circus.getAnimals().get(0).toString().equals(bird.toString()));
    }

    @Test
    void testSortAnimalsByAge() {
        Bird bird = new Bird("Polly", 20, "Parrot", "Blue", "Bird.jpg");
        Lion lion = new Lion("Leo", 6, "Northern Lion", "Yellow", "Lion.jpg");
        circus.addAnimal(bird);
        circus.addAnimal(lion);
        circus.sortAnimalsByAge();
        assertTrue(circus.getAnimals().get(0).getAge() == 6);
    }

    @Test
    void testSortAnimalsByName() {
        Bird bird = new Bird("Polly", 20, "Parrot", "Blue", "Bird.jpg");
        Lion lion = new Lion("Leo", 6, "Northern Lion", "Yellow", "Lion.jpg");
        circus.addAnimal(bird);
        circus.addAnimal(lion);
        circus.sortAnimalsByName();
        assertTrue(circus.getAnimals().get(0).getName().equals("Leo"));
    }

    @Test
    void testAddTicket() {
        Ticket ticket = new Ticket("MONDAY", 10.00, "Adult");
        circus.addTicket(ticket);
        assertTrue(circus.getTickets().get(0).toString().equals(ticket.toString()));
    }

    @Test
    void testGenerateTicket() {
        Ticket ticket1 = new Ticket("MONDAY", 10.00, "Adult");
        Ticket ticket2 = circus.generateTicket("MONDAY", 10.00, "Adult");
        assertTrue(ticket1.toString().equals(ticket2.toString()));
    }
}

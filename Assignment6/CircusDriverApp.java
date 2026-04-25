import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A program to manage a circus
 * Due: 05/05/2026
 * Platform/compiler: Eclipse, Java 26, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */

public class CircusDriverApp {
    public static void main(String[] args) {
        Circus circus = new Circus();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to Bob's Circus Management System!");

        while (!exit) {
            try {
                // Display menu
                System.out.println("\nMenu:");

                System.out.println("1. Add Animal");
                System.out.println("2. Add Person");
                System.out.println("3. Add Building");
                System.out.println("4. Generate Ticket");
                System.out.println("5. Display All Animals");
                System.out.println("6. Display All Persons");
                System.out.println("7. Display All Buildings");
                System.out.println("8. Sort Animals by Age");
                System.out.println("9. Sort Animals by Name");
                System.out.println("10. Search Animal by Name");
                System.out.println("11. Exit\n");

                System.out.print("Choose an option: ");

                // Use validateInput method
                int choice = 0;
                boolean validInput = false;

                // Retry until valid input is received
                while (!validInput) {
                    try {
                        choice = validateInput(scanner);
                        validInput = true;
                    } catch (CustomInputMismatchException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Please choose again.");
                    }
                }

                switch (choice) {
                    case 1:
                        handleAddAnimal(circus, scanner);
                        break;
                    case 2:
                        handleAddPerson(circus, scanner);
                        break;
                    case 3:
                        handleAddBuilding(circus, scanner);
                        break;
                    case 4:
                        handleGenerateTicket(circus, scanner);
                        break;
                    case 5:
                        System.out.println("Displaying all animals:");
                        System.out.println("----------------------");
                        circus.displayAllAnimals();
                        break;
                    case 6:
                        System.out.println("Displaying all persons:");
                        System.out.println("----------------------");
                        circus.displayAllPersons();
                        break;
                    case 7:
                        System.out.println("Displaying all buildings:");
                        System.out.println("------------------------");
                        circus.displayAllBuildings();
                        break;
                    case 8:
                        System.out.println("Sorting animals by age...");
                        circus.sortAnimalsByAge();
                        System.out.println("Animals sorted by age.");
                        break;
                    case 9:
                        System.out.println("Sorting animals by name...");
                        circus.sortAnimalsByName();
                        System.out.println("Animals sorted by name.");
                        break;
                    case 10:
                        System.out.print("Enter the name of the animal to search: ");
                        String searchName = scanner.nextLine();
                        circus.searchAnimalByName(searchName);
                        break;
                    case 11:
                        exit = true;
                        System.out.println("Exiting Bob's Circus Management System. Goodbye!\n");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                e.printStackTrace();
            }
        }

        System.out.println("Programmed by Kyle Dinardi.");
        scanner.close();
    }

    /**
     * Validates input for choices in main method
     *
     * @param input from keyboard
     * @return the number the user selected
     * @throws CustomInputMismatchException if user input is not an integer
     */
    private static int validateInput(Scanner scanner) throws CustomInputMismatchException {
        int input;

        try {
            input = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            throw new CustomInputMismatchException(
                    "Invalid choice: must be a number between 1 and 11.");
        }

        return input;
    }

    /**
     * Prompts the user to fill in animal fields and adds the new animal to the circus
     *
     * @param circus the circus
     * @param scanner input from keyboard
     */
    private static void handleAddAnimal(Circus circus, Scanner scanner) {
        Animal animal = null;
        boolean validInput = false;
        String type = null;

        while (!validInput) {
            System.out.print("Is the animal a 'bird', a 'dog', a 'horse', or a 'lion'? ");
            type = scanner.nextLine().toLowerCase().trim();

            if (type.equals("bird")
                    || type.equals("dog")
                    || type.equals("horse")
                    || type.equals("lion")) {
                validInput = true;
            } else {
                System.out.println(
                        "Invalid input: animals must be 'bird', 'dog', 'horse', or 'lion'.");
            }
        }

        System.out.print("Enter the animal's name: ");
        String name = scanner.nextLine().trim();
        validInput = false;
        int age = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the animal's age: ");
                age = scanner.nextInt();
                scanner.nextLine();

                if (age < 0) {
                    System.out.println("Invalid input: animal's age cannot be negative");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: animal's age must be a number.");
            }
        }

        System.out.print("Enter the animal's species: ");
        String species = scanner.nextLine().trim();
        System.out.print("Enter the animal's color: ");
        String color = scanner.nextLine().trim();

        switch (type) {
            case "bird":
                animal = new Bird(name, age, species, color, "Bird.jpg");
                break;
            case "dog":
                animal = new Dog(name, age, species, color, "Dog.jpg");
                break;
            case "horse":
                animal = new Horse(name, age, species, color, "Horse.jpg");
                break;
            case "lion":
                animal = new Lion(name, age, species, color, "Lion.jpg");
            default:
                System.out.println("Error: cannot add animal.");
        }

        if (animal != null) {
            circus.addAnimal(animal);
        }
    }

    /**
     * Prompts the user to fill in person fields and adds the new person to the circus
     *
     * @param circus the circus
     * @param scanner input from keyboard
     */
    private static void handleAddPerson(Circus circus, Scanner scanner) {
        Person person = null;
        boolean validInput = false;
        String type = null;

        while (!validInput) {
            System.out.print("Is the person an 'acrobatic' or a 'clerk? ");
            type = scanner.nextLine().toLowerCase().trim();

            if (type.equals("acrobatic") || type.equals("clerk")) {
                validInput = true;
            } else {
                System.out.println("Invalid input: persons must be 'acrobatic' or 'clerk'.");
            }
        }

        System.out.print("Enter the person name: ");
        String name = scanner.nextLine().trim();
        validInput = false;
        int age = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the person age: ");
                age = scanner.nextInt();
                scanner.nextLine();

                if (age < 0) {
                    System.out.println("Invalid input: person's age cannot be negative");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: animal's age must be a number.");
            }
        }

        validInput = false;
        int yearsWorked = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the number of years the person has worked: ");
                yearsWorked = scanner.nextInt();
                scanner.nextLine();

                if (yearsWorked < 0) {
                    System.out.println("Invalid input: years worked cannot be negative");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: years worked must be a number.");
            }
        }

        System.out.print("Enter the person's job: ");
        String job = scanner.nextLine().trim();

        switch (type) {
            case "acrobatic":
                person = new Acrobatic(name, age, yearsWorked, job, "acrobat.jpg");
                break;
            case "clerk":
                person = new Clerk(name, age, yearsWorked, job, "TicketingCashier.jpg");
                break;
            default:
                System.out.println("Error: cannot add person.");
        }

        if (person != null) {
            circus.addPerson(person);
        }
    }

    /**
     * Prompts the user to fill in building fields and adds the new building to the circus
     *
     * @param circus the circus
     * @param scanner input from keyboard
     */
    private static void handleAddBuilding(Circus circus, Scanner scanner) {
        Building building = null;
        boolean validInput = false;
        String type = null;

        while (!validInput) {
            System.out.print("Is the building an 'arena' or a 'ticketing office? ");
            type = scanner.nextLine().toLowerCase().trim();

            if (type.equals("arena") || type.equals("ticketing office")) {
                validInput = true;
            } else {
                System.out.println(
                        "Invalid input: buildings must be 'arena' or 'ticketing office'.");
            }
        }

        System.out.print("Enter the building's color: ");
        String color = scanner.nextLine().trim();
        validInput = false;
        double length = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the building's length: ");
                length = scanner.nextDouble();

                if (length < 0) {
                    System.out.println("Invalid input: building's length cannot be negative");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: building's length must be a number.");
            }
        }

        validInput = false;
        double width = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the building's width: ");
                width = scanner.nextDouble();

                if (width < 0) {
                    System.out.println("Invalid input: building's width cannot be negative");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: building's width must be a number.");
            }
        }

        switch (type) {
            case "arena":
                building = new Arena(color, length, width, "Arena.jpg");
                break;
            case "ticketing office":
                building = new TicketingOffice(color, length, width, "TicketOffice.jpg");
                break;
            default:
                System.out.println("Error: cannot add building.");
        }

        if (building != null) {
            circus.addBuilding(building);
        }
    }

    /**
     * Prompts the user to fill in ticket fields and adds the new ticket(s) to the circus
     *
     * @param circus the circus
     * @param scanner input from keyboard
     */
    private static void handleGenerateTicket(Circus circus, Scanner scanner) {
        double totalAmount = 0;
        double basePrice;
        StringBuilder ticketDetails = new StringBuilder();
        boolean addMoreTickets = true;

        System.out.print("\nEnter ticket base price: ");
        basePrice = scanner.nextDouble();
        scanner.nextLine();
        ticketDetails.append(String.format("Regular ticket price: $%.2f%n%n", basePrice));

        while (addMoreTickets) {
            // Select day of the week
            System.out.println("\nSelect day of the week:");

            for (int i = 0; i < DayOfWeek.values().length; i++) {
                DayOfWeek day = DayOfWeek.values()[i];

                if (day.getDiscount() > 0) {
                    System.out.printf(
                            "%d. %s (%.0f%% discount)%n", i + 1, day, day.getDiscount() * 100);
                } else {
                    System.out.printf("%d. %s%n", i + 1, day);
                }
            }

            System.out.print("\nEnter your choice: ");
            int dayChoice = scanner.nextInt();
            scanner.nextLine();

            if (dayChoice < 1 || dayChoice > DayOfWeek.values().length) {
                System.out.println("Invalid choice. Please select a valid day.");
                continue;
            }

            DayOfWeek selectedDay = DayOfWeek.values()[dayChoice - 1];
            double dayDiscount = selectedDay.getDiscount();

            // Select customer type
            System.out.println("\nEnter customer type:");
            System.out.println("1. Child (10% discount)");
            System.out.println("2. Student (10% discount)");
            System.out.println("3. Adult");
            System.out.println("4. Senior (5% discount)");

            System.out.print("\nEnter your choice: ");
            int customerType = scanner.nextInt();
            scanner.nextLine();

            double customerDiscount = 0.0;
            String customerTypeName = "";

            switch (customerType) {
                case 1:
                    customerDiscount = 0.10;
                    customerTypeName = "child";
                    break;
                case 2:
                    customerDiscount = 0.10;
                    customerTypeName = "student";
                    break;
                case 3:
                    customerTypeName = "adult";
                    break;
                case 4:
                    customerDiscount = 0.05;
                    customerTypeName = "senior";
                    break;
                default:
                    System.out.println("Invalid customer type. Please try again.");
                    continue;
            }

            // Select seat location
            System.out.println("\nSeat Location in the Arena:");
            System.out.println("1. Lower level");
            System.out.println("2. T-level (double ticket price)");
            System.out.println("3. Upper level (5% discount)");
            System.out.print("\nEnter your choice: ");

            int seatLocation = scanner.nextInt();
            scanner.nextLine();
            double seatMultiplier = (seatLocation == 2) ? 2.0 : 1.0;
            double seatDiscount = (seatLocation == 3) ? 0.05 : 0.0;

            System.out.print("Enter number of tickets: ");
            int numberOfTickets = scanner.nextInt();
            scanner.nextLine();

            // Calculate discounts and total price for this batch of tickets
            double discountMultiplier =
                    (1 - dayDiscount) * (1 - customerDiscount) * (1 - seatDiscount);

            double individualPrice = basePrice * seatMultiplier * discountMultiplier;
            double batchPrice = individualPrice * numberOfTickets;

            // Add to total amount
            totalAmount += batchPrice;

            // Append details of this batch to the ticket details
            String dayString = selectedDay.toString();

            for (int i = 0; i < numberOfTickets; i++) {
                Ticket ticket = circus.generateTicket(dayString, individualPrice, customerTypeName);
                ticketDetails.append("\n" + ticket);
            }

            // Ask user to add more tickets
            System.out.print("\nDo you want to add more tickets? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();
            addMoreTickets = response.equals("y");
        }

        // Display ticket calculation details
        System.out.println("\nTicket Calculation Details:");
        System.out.println("---------------------------");
        System.out.println(ticketDetails);

        // Display final total amount
        System.out.printf("Final Total Amount: $%.2f%n", totalAmount);
        System.out.println("Enjoy the show!");
    }
}

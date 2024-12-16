import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

class Rental {
    private String username;
    private String motorcycleType;
    private int rentalDuration; // in hours

    public Rental(String username, String motorcycleType, int rentalDuration) {
        this.username = username;
        this.motorcycleType = motorcycleType;
        this.rentalDuration = rentalDuration;
    }

    @Override
    public String toString() {
        return "Rental{" +
               "username='" + username + '\'' +
               ", motorcycleType='" + motorcycleType + '\'' +
               ", rentalDuration=" + rentalDuration +
               '}';
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }
}

class Main {
    private final Map<String, Integer> motorcycles;
    private final Map<String, User> users;
    private final Map<String, Rental> activeRentals;
    private final Scanner scanner;

    public Main() {
        motorcycles = new HashMap<>();
        motorcycles.put("Honda", 5);
        motorcycles.put("Yamaha", 3);
        motorcycles.put("Suzuki", 2);

        users = new HashMap<>();
        activeRentals = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    private void displayUserAgreement() {
        System.out.println("\n--- User Agreement ---");
        System.out.println("1. You are responsible for the motorcycle during the rental period.");
        System.out.println("2. Late returns may incur additional charges.");
        System.out.println("3. Ensure to follow all traffic rules and regulations.");
        System.out.println("--------------------------------");
    }

    private String logIn() {
        System.out.println("\n--- Log In / Register ---");
        while (true) {
            System.out.println("1. Log In");
            System.out.println("2. Register");
            System.out.print("Enter your choice (1-2): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine().trim();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine().trim();

                    User user = users.get(username);
                    if (user != null && user.getPassword().equals(password)) {
                        System.out.println("Log in successful.");
                        return username;
                    } else {
                        System.out.println("Invalid username or password. Please try again.");
                    }
                    break;

                case "2":
                    System.out.print("Enter new username: ");
                    String newUsername = scanner.nextLine().trim();
                    if (users.containsKey(newUsername)) {
                        System.out.println("Username already exists. Try another.");
                        continue;
                    }
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine().trim();
                    users.put(newUsername, new User(newUsername, newPassword));
                    System.out.println("Registration successful. You can now log in.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }

    private void rentMotorcycle(String username) {
        System.out.println("\nAvailable Motorcycles:");
        for (Map.Entry<String, Integer> entry : motorcycles.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " available");
        }

        System.out.print("Enter the motorcycle type you want to rent: ");
        String motorcycleType = scanner.nextLine().trim();
        motorcycleType = motorcycleType.substring(0, 1).toUpperCase() + motorcycleType.substring(1).toLowerCase();

        if (!motorcycles.containsKey(motorcycleType) || motorcycles.get(motorcycleType) <= 0) {
            System.out.println("Sorry, that motorcycle is not available.");
            return;
        }

        System.out.print("Enter rental duration in hours: ");
        try {
            int rentalDuration = Integer.parseInt(scanner.nextLine().trim());
            if (rentalDuration <= 0) {
                System.out.println("Rental duration must be positive.");
                return;
            }

            // Create a rental and update the available motorcycles
            Rental rental = new Rental(username, motorcycleType, rentalDuration);
            activeRentals.put(username, rental);
            motorcycles.put(motorcycleType, motorcycles.get(motorcycleType) - 1);
            System.out.println("You have successfully rented a " + motorcycleType + " for " + rentalDuration + " hours.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private void returnMotorcycle(String username) {
        Rental rental = activeRentals.remove(username);
        if (rental != null) {
            String motorcycleType = rental.getMotorcycleType();
            motorcycles.put(motorcycleType, motorcycles.get(motorcycleType) + 1);
            System.out.println("You have successfully returned the " + motorcycleType + ". It was rented for " + rental.getRentalDuration() + " hours.");
        } else {
            System.out.println("You have no active rentals.");
        }
    }

    public void start() {
        displayUserAgreement();
        String username = logIn();

        while (true) {
            System.out.println("\n--- Motorcycle Rental Service ---");
            System.out.println("1. Rent a Motorcycle");
            System.out.println("2. Return a Motorcycle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    rentMotorcycle(username);
                    break;
                case "2":
                    returnMotorcycle(username);
                    break;
                case "3":
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }

    public static void main(String[] args) {
        Main service = new Main();
        service.start();
    }
}
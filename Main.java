import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // INITIALIZE MAIN FUNCTION AND SETUP STANLEY CUP CHAMPIONS MAP
    public static void main(String[] args) {
        // CREATE A MAP TO STORE THE YEAR AND THE CORRESPONDING STANLEY CUP CHAMPION
        Map<Integer, String> champions = new HashMap<>();
        champions.put(1980, "New York Islanders");
        champions.put(1981, "New York Islanders");
        champions.put(1982, "New York Islanders");
        champions.put(1983, "New York Islanders");
        champions.put(1984, "Edmonton Oilers");
        champions.put(1985, "Edmonton Oilers");
        champions.put(1986, "Montreal Canadiens");
        champions.put(1987, "Edmonton Oilers");
        champions.put(1988, "Edmonton Oilers");
        champions.put(1989, "Calgary Flames");
        champions.put(1990, "Edmonton Oilers");
        champions.put(1991, "Pittsburgh Penguins");
        champions.put(1992, "Pittsburgh Penguins");
        champions.put(1993, "Montreal Canadiens");
        champions.put(1994, "New York Rangers");
        champions.put(1995, "New Jersey Devils");
        champions.put(1996, "Colorado Avalanche");
        champions.put(1997, "Detroit Red Wings");
        champions.put(1998, "Detroit Red Wings");
        champions.put(1999, "Dallas Stars");
        champions.put(2000, "New Jersey Devils");
        champions.put(2001, "Colorado Avalanche");
        champions.put(2002, "Detroit Red Wings");
        champions.put(2003, "New Jersey Devils");
        champions.put(2004, "Tampa Bay Lightning");
        champions.put(2005, "Lockout year, no Stanley cup champion crowned");
        champions.put(2006, "Carolina Hurricanes");
        champions.put(2007, "Anaheim Ducks");
        champions.put(2008, "Detroit Red Wings");
        champions.put(2009, "Pittsburgh Penguins");
        champions.put(2010, "Chicago Blackhawks");
        champions.put(2011, "Boston Bruins");
        champions.put(2012, "Los Angeles Kings");
        champions.put(2013, "Chicago Blackhawks");
        champions.put(2014, "Los Angeles Kings");
        champions.put(2015, "Chicago Blackhawks");
        champions.put(2016, "Pittsburgh Penguins");
        champions.put(2017, "Pittsburgh Penguins");
        champions.put(2018, "Washington Capitals");
        champions.put(2019, "St. Louis Blues");
        champions.put(2020, "Tampa Bay Lightning");
        champions.put(2021, "Tampa Bay Lightning");
        champions.put(2022, "Colorado Avalanche");
        champions.put(2023, "Vegas Golden Knights");
        champions.put(2024, "Florida Panthers");

        // CREATE SCANNER FOR USER INPUT
        Scanner scanner = new Scanner(System.in);

        // PRINT PROGRAM TITLE
        System.out.println("\n===================================");
        System.out.println("  Stanley Cup Champions 1980-2024  ");
        System.out.println("===================================");

        // ENTER MAIN LOOP FOR USER INPUT AND DISPLAY
        while (true) {
            System.out.println(
                    "Enter a year to show the Stanley Cup champion from the years 1980-2024:");

            // CAPTURE USER INPUT AND TRY TO PARSE IT AS AN INTEGER
            String userInput = scanner.nextLine();

            try {
                int yearInput = Integer.parseInt(userInput);

                System.out.println();

                // DISPLAY CHAMPION FOR ENTERED YEAR IF FOUND
                if (champions.containsKey(yearInput)) {
                    System.out.println("Stanley Cup Champions " + yearInput + ": " + champions.get(yearInput));
                } else {
                    System.out.println("No champion found for that year.");
                }
            } catch (NumberFormatException e) {
                // HANDLE CASE IF THE USER DOES NOT ENTER A VALID YEAR
                System.out.println("Invalid input. Please enter a valid year.");
                // Skip the rest of the logic and continue asking for a valid year
                continue;
            }

            // ASK USER IF THEY WANT TO RUN THE PROGRAM AGAIN OR EXIT
            System.out.println("\nPress Enter to run the program again or press 'q' and then Enter to exit.");
            String continueInput = scanner.nextLine();

            // If 'q' is pressed, exit the program
            if (continueInput.equalsIgnoreCase("q")) {
                break; // Exit the program immediately
            } else if (continueInput.isEmpty()) {
                // If Enter is pressed, continue the program immediately
                continue;
            } else {
                // Invalid input case when it's neither 'q' nor empty (Enter)
                System.out.println("Invalid input. Please press Enter to continue or 'q' and then Enter to exit.");
            }
        }

        // CLOSE SCANNER AND PRINT EXIT MESSAGE
        scanner.close();
        System.out.println();
        System.out.println("Exiting program");
        System.out.println();
    }
}

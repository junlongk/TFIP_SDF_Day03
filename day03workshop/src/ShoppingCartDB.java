import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartDB {
    
    public static final List<String> VALID_COMMANDS = Arrays.asList("login", "add", "list", "exit", "users");

    public void startShell() {

        System.out.println("Welcome to MultiUser Shopping Cart >> ");
        Scanner sc = new Scanner(System.in);
        // sc.nextLine(); // current line until end of line
        // sc.next(); // word until whitespace
        String line;
        boolean stop = false;

        while (!stop) {
            line = sc.nextLine();
            line = line.trim();
            System.out.println("=> " + line);

            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Exiting!!");
                stop = true;
            }

            // Validate Command
            if (!this.ValidateInput(line)) {
                System.out.println("Invalid input: ^^");
            } else {
                System.out.println("Processing : " + line);
            }

            // Process Command

        }
        sc.close();     
    }

    public boolean ValidateInput(String input) {
        String[] parts = input.split(" ");
        String command = parts[0].trim();

        // Scanner lsc = new Scanner(input);
        // String command = lsc.next().trim();

        return VALID_COMMANDS.contains(command);
    }
}

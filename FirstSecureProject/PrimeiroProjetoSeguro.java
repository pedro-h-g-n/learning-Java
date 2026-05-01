import java.util.Scanner;

public class PrimeiroProjetoSeguro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String inputoriginal = reader.nextLine();
        String cleanname = inputoriginal.trim().replace("'", "");

        if (cleanname.isEmpty()) {
            System.out.println("error: The name cannot be empty!");
        } else{
            System.out.println("user '" + cleanname + "' Registered successfully!");
        }

        reader.close();
    }
}
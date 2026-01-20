import java.util.Scanner;
public class FahrenheitConverter {
public static void main(String[] args) {
    Scanner celsius = new Scanner(System.in);
    
    System.out.println("-----Celsius to fahrenheits converter -----");

    System.out.print("Enter a temperature in Celsius: ");
    double degrees = celsius.nextDouble();

    double Farenheit = (degrees * 1.8) + 32;

    System.out.printf("The temperature in fahrenheits is: %.1f",Farenheit);
}
    
}
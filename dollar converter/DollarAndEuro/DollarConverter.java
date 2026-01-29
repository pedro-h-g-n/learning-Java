import java.util.Scanner;
public class DollarConverter {
    public static void main(String[] args) {
        Scanner BRL = new Scanner(System.in);

        double USD = 5.20;//Dollar value on the day i wrote this.

        System.out.println("Enter the value in Reais:");
        double valueBRL = BRL.nextDouble();

        double valueUSD = valueBRL/USD;

        System.out.printf("The value in dollars is:$%.2f%n", valueUSD);

        BRL.close();
    }
    
}
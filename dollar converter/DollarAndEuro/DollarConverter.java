import java.util.Scanner;
public class DollarConverter {
    public static void main(String[] args) {
        Scanner choiceAndBrl = new Scanner(System.in);

        double EUR = 6.23;//Euro value on the day i wrote this.
        double USD = 5.20;//Dollar value on the day i wrote this.
        
        System.out.println("1 - Dollar(USD)");
        System.out.println("2 - Euro(UER)");
        System.out.println("choose an option:");
        int option = choiceAndBrl.nextInt();

        System.out.println("Enter the value in Reais:");
        double valueBRL = choiceAndBrl.nextDouble();

        if (option == 1) {
            System.out.printf("The value in dollars is:$%.2f%n",(valueBRL/USD));
        }else if (option == 2) {
            System.out.printf("The value in euro is:€%.2f%n", valueBRL/ EUR);
        }else{
            System.out.println("invalid option!");
        }

        choiceAndBrl.close();
    }
    
}
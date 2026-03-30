import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class LotGel{
    double balance;

    public static void main(String[] args) {
        Random attack = new Random();
        Scanner again = new Scanner(System.in);
        ArrayList <Integer> hollow = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7));
        ArrayList <Integer> enemy = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 6));
        LotGel knight = new LotGel(0.0);

        System.out.println("knight's geo: "+knight.balance);
        System.out.println("Type 'yes' if you wanna fight.");
        String fight = again.nextLine();

        while (fight.equalsIgnoreCase("yes")) {
        int indexHollow = attack.nextInt(hollow.size());
        int valueHollow = hollow.get(indexHollow);

        int indexEnemy = attack.nextInt(enemy.size());
        int valueEnemy = enemy.get(indexEnemy);

        System.out.println(valueHollow);
        System.out.println(valueEnemy);
        if (valueHollow > valueEnemy) {
            knight.kill(50.0);
            System.out.println("Knight's geo: "+knight.balance);
        }else{
            System.out.println("Hit");
        }

        System.out.println("Do you wanna fight again? (yes/no)");
        fight = again.nextLine();

        
        }
        System.out.println("The final Knight's geo:"+knight.balance);
        }

    public LotGel(double balance){
        this.balance = balance;
    }


    
    public void kill(double quantity){ 
        this.balance += quantity;
    }
}
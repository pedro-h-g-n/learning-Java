import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);

    System.out.print("How many two-month periods will there be: ");
    int tmperiods = n.nextInt();
    n.nextLine(); //I added this line cause the Scanner glitched
    
    System.out.print("Enter the student's name: ");
    String name = n.nextLine();

    int loop = 0;
    while (loop < tmperiods) {
    System.out.print("Enter the Student grade: ");    
    double grade = n.nextDouble();
    loop ++;
    }
    
     

    
    }
}

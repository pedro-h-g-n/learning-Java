import java.util.ArrayList;
import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    ArrayList <Double> grades = new ArrayList <>();
    
    System.out.print("Enter the student's name: ");
    String name = n.nextLine();

    System.out.print("How many grades: ");
    int totalPeriods = n.nextInt();


    for(int i = 0; i < totalPeriods; i++){
    System.out.print("Enter grade "+(i + 1)+ ": ");
    grades.add(n.nextDouble());
    }
    
    int counter = 0;
    double sum  = 0;
    while (counter < grades.size()) {
        sum += grades.get(counter);
        counter ++;
    }
    
    double average = sum / grades.size();

    if (average >= 7) {
        System.out.println(name+" approved!");
    }
    else if(average >= 5 && average <= 6.9){
        System.out.println(name+" recovery");
    }
    else{
        System.out.println(name+" failed");
    }
    }
}

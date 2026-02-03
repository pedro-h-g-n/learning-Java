public class Palindrome {
    public static void main(String[] args) {
        int originalNumber = 121;
        int number = originalNumber;
        int invertedNumber = 0;

        while (number > 0){
            int lastDigit = number % 10;
            invertedNumber = (invertedNumber* 10) + lastDigit;
            number /= 10;
        }

        if (originalNumber ==  invertedNumber) {
            System.out.println(originalNumber+" is a palindrome number!");
        }
        else {
            System.out.println(originalNumber+" is not a palidrome number!");
        }
    }
}

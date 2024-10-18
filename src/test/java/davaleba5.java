import java.util.Random;
import java.util.Scanner;

public class davaleba5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = new Random().nextInt(50) + 1;
        int guess;

        System.out.println("გამოიცანით რიცხვი 1-დან 50-ის ჩათვლით:");

        do {
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("სცადე უფრო მაღალი რიცხვი!");
            } else if (guess > number) {
                System.out.println("სცადე უფრო დაბალი რიცხვი!");
            }
        } while (guess != number);

        System.out.println("გილოცავთ! რიცხვი არის " + number);
        scanner.close();
    }
}

import java.util.Scanner;

public class davaleba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე ქულა (0-100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("არასწორია. გთხოვთ, შეიყვანეთ ქულა 0-დან 100-მდე.");
        } else {
            String grade;

            if (score >= 90) {
                grade = "A";
                System.out.println("გილოცავ უმაღლეს შეფასებას,");
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
                System.out.println("სამწუხაროდ,");
            }

            System.out.println("შენი ქულა არის: " + grade);

        }

        scanner.close();
    }
}

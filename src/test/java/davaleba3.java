import java.util.Scanner;

public class davaleba3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("შეიყვანეთ ციფრი: ");
        int number = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

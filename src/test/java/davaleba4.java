import java.util.Scanner;

public class davaleba4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("შეიყვანეთ პოზიტიური ციფრი: ");
        int n = scanner.nextInt();


        if (n <= 0) {
            System.out.println("გთხოვთ, შეიყვანოთ მხოლოდ პოზიტიური ციფრი.");
            return;
        }

        int sum = 0;
        int i = 2;


        while (i <= n) {
            sum += i;
            i += 2;
        }


        System.out.println(" ლუწი ციფრების ჯამი 1 დან " + n +"-ის ჩათვლით" + " არის: " + sum);

        scanner.close();
    }
}

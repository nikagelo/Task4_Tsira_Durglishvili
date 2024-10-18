import java.util.Scanner;

public class davaleba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a letter (a-e): ");
        char letter = scanner.next().charAt(0);

        switch (letter) {
            case 'a':
                System.out.println("letter a is vowel");
                break;
            case 'e':
                System.out.println("letter e is vowel");
                break;
            case 'i':
                System.out.println("letter i is vowel");
                break;
            case 'o':
                System.out.println("letter o is vowel");
                break;
            case 'u':
                System.out.println("letter u is vowel");
                break;
            default:
                System.out.println("This letter is a consonant");
        }

        scanner.close();
    }

}

import java.util.Scanner;

public class Numberlooper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number");
        int number = scanner.nextInt();

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

        if (number > 0) {
            for (int i =1; i <=number; i++) {
            System.out.println(i);
        }
        } else {
            System.out.println("please enter a positve number");
        }

    } else {
        System.out.println("Error: please enter a valid number");
    }
       scanner.close();
    }
}

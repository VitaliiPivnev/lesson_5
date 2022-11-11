import java.util.Scanner;

public class HomeWork_FIVE {
    public static void main(String[] args) {
        System.out.println("First LEVEL");
        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println("plus");
        System.out.println((double) first + (double) second);
        System.out.println("minus");
        System.out.println((double) first - (double) second);
        System.out.println("multiply");
        System.out.println((double) first * (double) second);
        System.out.println("divide");
        System.out.println((double) first / (double) second);


        System.out.println("Second LEVEL");

        System.out.println("Please enter a three-digit number");

        Scanner scannerB = new Scanner(System.in);
        int treeDigit = scannerB.nextInt();
        int a = treeDigit / 100;
        int b = (treeDigit / 10) % 10;
        int c = treeDigit % 10;

        System.out.println("First digit");
        System.out.println(a);
        System.out.println("Second digit");
        System.out.println(b);
        System.out.println("Third digit");
        System.out.println(c);

    }
}

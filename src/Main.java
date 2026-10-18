import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = 0, np1 = 0, np2 = 0, np3 = 0, np4 = 0;
        double n8 = 0;
        System.out.print("Enter real password: ");
        //просто для тренировки
        if (scan.hasNextLong()) {
            n = scan.nextLong();
        }
        //
        else if (scan.hasNextDouble()) {
            n = scan.nextDouble();
        }
        np1 = n;
        np2 = Math.pow(n, 2);
        np3 = Math.pow(n, 3);
        np4 = Math.pow(n, 4);
        System.out.println("n to first power = " + np1);
        System.out.println("n to second power = " + np2);
        System.out.println("n to third power = " + np3);
        System.out.println("n to fourth power = " + np4);
    }

}
package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a printer:");
            System.out.println("1. Dot-Matrix Printer");
            System.out.println("2. LaserJet Printer");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Printer dotMatrixPrinter = new DotMatrix();
                    dotMatrixPrinter.configuration();
                    dotMatrixPrinter.display();
                    break;

                case 2:
                    Printer laserjetPrinter = new LaserJet();
                    laserjetPrinter.configuration();
                    laserjetPrinter.display();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
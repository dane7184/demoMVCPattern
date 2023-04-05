package co.istad.mvcapp.util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getText(String label) {
        System.out.print(label);
        return scanner.nextLine();
    }

    public static Integer getInteger(String label) {
        do {
            System.out.print(label);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static double getFloatingPoint(String label) {
        do {
            System.out.print(label);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void pressEnterToContinue() {
        System.out.println();
        System.out.println("|");
        System.out.println("Press Enter key to continue...");
        System.out.println("|");
        System.out.println();
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

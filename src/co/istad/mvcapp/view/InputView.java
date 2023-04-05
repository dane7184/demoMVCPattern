package co.istad.mvcapp.view;

import java.util.Scanner;

public class InputView {
    public static int getInputNumber(Scanner scanner){
        try {
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Allow numbwe only ...");
        }
        return 0;
    }
    public static String getInputData(Scanner scanner){
        return scanner.nextLine();
    }
}

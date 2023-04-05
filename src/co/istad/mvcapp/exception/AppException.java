package co.istad.mvcapp.exception;

import java.util.Scanner;

public class AppException {
    private static void checkAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("You just a kid");
        }
    }
    private static void test(){

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Date : ");
            Integer data = Integer.parseInt(scanner.nextLine());
            System.out.println("Data : "+ data);
        }catch (ArithmeticException | NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    private static int number(){
        try {
            return 100;
        }catch (Exception e){
            return 200;
        }finally {
            System.out.println("hello finally");
        }
    }
    public static void main(String[] args) {

        try{
            checkAge(12);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

//        test();
//        System.out.println(number());
//
//        try {
//            System.out.println(100/0);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
    }
}

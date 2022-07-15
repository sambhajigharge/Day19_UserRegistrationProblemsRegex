package Regex;

import java.util.Scanner;

public class UserRegistrationMain {
    static Scanner scanner = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Welcome to user registration");
    }

    public static void main(String[] args) {
        welcome();
        System.out.println("Enter 1 : to validate First Name ");
        System.out.println("Enter 2 : to validate last Name ");
        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
        }
    }
}

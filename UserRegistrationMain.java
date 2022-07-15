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
        System.out.println("Enter 2 : to validate Last Name ");
        System.out.println("Enter 3 : to validate Email ID ");
        System.out.println("Enter 4 : to validate Phone Number ");
        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmailID();
                break;
            case 4:
                UserRegistration.validPhoneNumber();
                break;
        }
    }
}

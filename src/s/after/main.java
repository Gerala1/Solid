package s.after;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to my application");

        Person person = new Person();

        System.out.println("What is your full name: ");
        person.setFullName(reader.nextLine());

        if (person.getFullName() == null) {
            System.out.println("You did not give us a valid name!");
        }



        System.out.println(String.format("Your name is: " + person.getFullName()));

        System.out.println("End of application");
    }
}

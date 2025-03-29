package hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String type;

            while (true) {
                System.out.print("\nDo you want a dog, a cat, or just an animal? ");
                type = scanner.nextLine().trim().toLowerCase();

                if (type.equals("dog") || type.equals("cat") || type.equals("animal")) {
                    break;
                }
                System.out.println("Invalid input. Please enter 'dog', 'cat', or 'animal'.");
            }

            System.out.print("Enter the animal's name: ");
            String name = scanner.nextLine().trim();

            Animal animal;
            if (type.equals("dog")) {
                animal = new Dog(name);
            } else if (type.equals("cat")) {
                animal = new Cat(name);
            } else {
                animal = new Animal(name);
            }

            System.out.print("Enter running distance: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            int runDistance = scanner.nextInt();
            animal.run(runDistance);

            System.out.print("Enter swimming distance: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            int swimDistance = scanner.nextInt();
            animal.swim(swimDistance);
            scanner.nextLine();

            System.out.println("\nTotal animals created: " + Animal.animalCount);
            System.out.println("Total dogs: " + Dog.dogCount);
            System.out.println("Total cats: " + Cat.catCount);

            System.out.print("\nDo you want to create another animal? (yes/no): ");
            String continueInput = scanner.nextLine().trim().toLowerCase();
            if (!continueInput.equals("yes")) {
                break;
            }
        }

        System.out.println("Program finished.");
        scanner.close();
    }
}